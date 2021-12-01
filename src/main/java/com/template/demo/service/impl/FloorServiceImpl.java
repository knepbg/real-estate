package com.template.demo.service.impl;

import com.template.demo.exeption.ResourceNorFoundException;
import com.template.demo.model.Floor;
import com.template.demo.repository.FloorRepository;
import com.template.demo.service.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FloorServiceImpl implements FloorService {

    private final FloorRepository floorRepository;

    @Autowired
    public FloorServiceImpl(FloorRepository floorRepository) {
        this.floorRepository = floorRepository;
    }

    @Override
    public Set<Floor> findAll() {
        SortedSet<Floor> floors = new TreeSet<>(Comparator.comparing(Floor::getId));
        floors.addAll(floorRepository.findAll());
        return floors;
    }

    @Override
    public Floor save(Floor floor) {
        try {
            return floorRepository.save(floor);
        }catch (DataIntegrityViolationException exception) {
            throw new DuplicateFormatFlagsException(String.format("Floor whith number %d already exists.", floor.getNumber()));
            }
        }

    @Override
    public Floor findByNumber(Integer number) {
        return floorRepository.findByNumber(number)
                .orElseThrow(() -> new ResourceNorFoundException(String.format("Floor whit %d does not exist.", number))) ;
    }

    @Override
    public Floor findById(Long id) {
        return floorRepository.findById(id)
                .orElseThrow(() -> new ResourceNorFoundException(String.format("Floor whit id %d does not exist.", id))) ;
    }

    @Override
    public Floor update(Floor floor, Long id) {
        Floor foundFloor = findById(id);
        Floor updatedFloor = Floor.builder()
                .id(foundFloor.getId())
                .number((floor.getNumber()))
                .build();
        return floorRepository.save(updatedFloor);
    }

    @Override
    public void delete(Long id) {
        floorRepository.deleteById(id);

    }


}
