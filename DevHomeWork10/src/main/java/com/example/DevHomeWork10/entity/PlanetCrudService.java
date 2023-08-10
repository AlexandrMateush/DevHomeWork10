package com.example.DevHomeWork10.entity;

import com.example.DevHomeWork10.Planet;
import com.example.DevHomeWork10.entity.completion.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanetCrudService {
    private final PlanetRepository planetRepository;

    @Autowired
    public PlanetCrudService(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    public Planet createPlanet(Planet planet) {
        return planetRepository.save(planet);
    }

    public Planet getPlanetById(String id) {
        return planetRepository.findById(id).orElse(null);
    }

    public List<Planet> getAllPlanets() {
        return planetRepository.findAll();
    }

    public void deletePlanetById(String id) {
        planetRepository.deleteById(id);
    }
}
