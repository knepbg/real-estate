package com.template.demo.service;

import com.template.demo.model.Floor;
import com.template.demo.model.Neighbourhood;

import java.util.Set;

public interface NeighbourhoodService {

    Neighbourhood save (Neighbourhood neighbourhood);

    Neighbourhood findByName(String name);

    Neighbourhood findById(Long id);

    Neighbourhood update (Neighbourhood neighbourhood, Long id);

    void delete(Long id);

    Set<Neighbourhood> findAll();

}
