package com.example.DevHomeWork10.entity.completion;

import com.example.DevHomeWork10.Planet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetRepository extends JpaRepository<Planet, String> {
    Planet findById(int id);
    Planet findByName(String name);

}
