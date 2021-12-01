package com.template.demo.service.impl;

import com.template.demo.repository.NeighbourhoodRepository;
import com.template.demo.service.NeighbourhoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NeighbourhoodServiceImpl implements NeighbourhoodService {

    private final NeighbourhoodRepository neighbourhoodRepository;

    @Autowired
    public NeighbourhoodServiceImpl (NeighbourhoodRepository neighbourhoodRepository) {
        this.neighbourhoodRepository=neighbourhoodRepository;
    }
}
