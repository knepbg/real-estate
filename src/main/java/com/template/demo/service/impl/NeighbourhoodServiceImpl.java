package com.template.demo.service.impl;

import com.template.demo.model.Neighbourhood;
import com.template.demo.repository.NeighbourhoodRepository;
import com.template.demo.service.NeighbourhoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class NeighbourhoodServiceImpl implements NeighbourhoodService {

    private final NeighbourhoodRepository neighbourhoodRepository;

    @Autowired
    public NeighbourhoodServiceImpl (NeighbourhoodRepository neighbourhoodRepository) {
        this.neighbourhoodRepository=neighbourhoodRepository;
    }

    @Override
    public Neighbourhood save(Neighbourhood neighbourhood) {
        return neighbourhoodRepository.save(neighbourhood);
    }

    @Override
    public Neighbourhood findByName(String name) {
        return null;
    }

    @Override
    public Neighbourhood findById(Long id) {
        return null;
    }

    @Override
    public Neighbourhood update(Neighbourhood neighbourhood, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Set<Neighbourhood> findAll() {
        return null;
    }
}
