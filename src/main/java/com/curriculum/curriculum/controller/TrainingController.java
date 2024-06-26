package com.curriculum.curriculum.controller;

import com.curriculum.curriculum.entity.Training;
import com.curriculum.curriculum.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TrainingController {

    private TrainingRepository trainingRepository;

    @Autowired
    public TrainingController(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    @GetMapping(value = "/trainings")
    public List<Training> getAllTrainings() {
        return trainingRepository.findAll();
    }

    @GetMapping("/trainings/{id}")
    public Training getTrainingById(@PathVariable Long id) {
        return trainingRepository.findById(id).orElse(null);
    }
}