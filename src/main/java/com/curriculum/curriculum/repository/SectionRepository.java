package com.curriculum.curriculum.repository;

import com.curriculum.curriculum.entity.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section, Long> {
}