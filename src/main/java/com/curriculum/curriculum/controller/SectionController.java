package com.curriculum.curriculum.controller;

import com.curriculum.curriculum.entity.Section;
import com.curriculum.curriculum.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.curriculum.curriculum.repository.SectionRepository;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class SectionController {

	private final SectionService sectionService;

	@Autowired
	public SectionController(SectionService sectionService) {
		this.sectionService = sectionService;
	}

	@GetMapping(value = "/sections")
	public List<Section> getAllSections() {
		return sectionService.getAllSectionsWithDetails();
	}

	@GetMapping("/sections/{id}")
	public Section getSectionById(@PathVariable Long id) {
		return sectionService.getSectionWithDetails(id);
	}
}
