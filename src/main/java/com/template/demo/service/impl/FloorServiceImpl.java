package com.template.demo.service.impl;

import com.template.demo.model.Floor;
import com.template.demo.repository.FloorRepository;
import com.template.demo.service.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class FloorServiceImpl implements FloorService {

    private final FloorRepository floorRepository;

    @Autowired
    public FloorServiceImpl(FloorRepository floorRepository) {
        this.floorRepository = floorRepository;
    }

    @Override
    public Floor save(Floor floor) {
        return floorRepository.save(floor);
    }

    @Override
    public Floor findByNumber(Integer number) {
        return null;
    }

    @Override
    public Floor findById(Long id) {
        return null;
    }

    @Override
    public Floor update(Floor floor, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Set<Floor> findAll() {
        return new HashSet<>(floorRepository.findAll());
    }
}
