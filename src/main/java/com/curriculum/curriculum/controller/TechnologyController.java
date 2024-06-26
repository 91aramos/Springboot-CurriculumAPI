package com.curriculum.curriculum.controller;

import com.curriculum.curriculum.entity.Technology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.curriculum.curriculum.repository.TechnologyRepository;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TechnologyController {

    private TechnologyRepository technologyRepository;

    @Autowired
    public TechnologyController(TechnologyRepository technologyRepository) {
        this.technologyRepository = technologyRepository;
    }


    @GetMapping(value = "/technologies")
    public List<Technology> getAllTechnologies() {
        return technologyRepository.findAll();
    }

    @GetMapping("/technologies/{id}")
    public Technology getTechnologyById(@PathVariable Long id) {
        return technologyRepository.findById(id).orElse(null);
    }

    @GetMapping("/technologies/section/{id_section}")
    public List<Technology> getTechnologiesBySectionId(@PathVariable Long id_section) {
        return technologyRepository.findBySectionId(id_section);
    }
}