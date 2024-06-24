package com.curriculum.curriculum.controller;

import com.curriculum.curriculum.entity.Section;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.curriculum.curriculum.repository.SectionRepository;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class SectionController {

	private SectionRepository sectionRepository;

	@Autowired
	public SectionController(SectionRepository sectionRepository) {
		this.sectionRepository = sectionRepository;
	}


	@GetMapping(value = "/sections")
	public List<Section> getAllSections() {
		return sectionRepository.findAll();
	}

	@GetMapping("/sections/{id}")
	public Section getSectionById(@PathVariable Long id) {
		return sectionRepository.findById(id).orElse(null);
	}
}
