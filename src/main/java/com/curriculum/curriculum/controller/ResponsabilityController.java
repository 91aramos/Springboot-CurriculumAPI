package com.curriculum.curriculum.controller;

import com.curriculum.curriculum.entity.Responsability;
import com.curriculum.curriculum.repository.ResponsabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ResponsabilityController {

    private ResponsabilityRepository responsabilityRepository;

    @Autowired
    public ResponsabilityController(ResponsabilityRepository responsabilityRepository) {
        this.responsabilityRepository = responsabilityRepository;
    }

    @GetMapping(value = "/responsabilities")
    public List<Responsability> getAllResponsabilities() {
        return responsabilityRepository.findAll();
    }

    @GetMapping("/responsabilities/{id}")
    public Responsability getResponsabilityById(@PathVariable Long id) {
        return responsabilityRepository.findById(id).orElse(null);
    }

    @GetMapping("/responsabilities/section/{id_section}")
    public List<Responsability> getResponsabilitiesBySectionId(@PathVariable Long id_section) {
        return responsabilityRepository.findBySectionId(id_section);
    }
}
