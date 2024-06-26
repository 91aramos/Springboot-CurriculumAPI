package com.curriculum.curriculum.service;

import com.curriculum.curriculum.entity.Section;

import java.util.List;

public interface SectionService {
    Section getSectionWithDetails(Long id);
    List<Section> getAllSectionsWithDetails();
}
