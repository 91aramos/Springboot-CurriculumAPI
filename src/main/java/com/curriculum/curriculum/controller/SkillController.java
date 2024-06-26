package com.curriculum.curriculum.controller;

import com.curriculum.curriculum.entity.Skill;
import com.curriculum.curriculum.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class SkillController {

    private SkillRepository skillRepository;

    @Autowired
    public SkillController(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    @GetMapping(value = "/skills")
    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }

    @GetMapping("/skills/{id}")
    public Skill getSkillById(@PathVariable Long id) {
        return skillRepository.findById(id).orElse(null);
    }
}
