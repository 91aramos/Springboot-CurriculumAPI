package com.curriculum.curriculum.service;

import com.curriculum.curriculum.entity.Section;
import com.curriculum.curriculum.repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SectionServiceImpl implements SectionService {

    private final SectionRepository sectionRepository;

    @Autowired
    public SectionServiceImpl(SectionRepository sectionRepository) {
        this.sectionRepository = sectionRepository;
    }

    @Override
    @Transactional
    public Section getSectionWithDetails(Long id) {
        Section section = sectionRepository.findById(id).orElse(null);
        if (section != null) {
            // Accessing the lists to force Hibernate to load them
            section.getListTechnologies().size();
            section.getListResponsabilities().size();
        }
        return section;
    }
    @Override
    @Transactional
    public List<Section> getAllSectionsWithDetails() {
        List<Section> sections = sectionRepository.findAll();
        sections.forEach(section -> {
            section.getListTechnologies().size();
            section.getListResponsabilities().size();
        });
        return sections;
    }
}