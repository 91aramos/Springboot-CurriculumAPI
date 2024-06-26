package com.curriculum.curriculum.repository;


import com.curriculum.curriculum.entity.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface TechnologyRepository extends JpaRepository<Technology, Long> {
    List<Technology> findBySectionId(Long id_section);
}
