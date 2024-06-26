package com.curriculum.curriculum.repository;


import com.curriculum.curriculum.entity.Responsability;
import com.curriculum.curriculum.entity.Technology;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResponsabilityRepository extends JpaRepository<Responsability, Long> {
    List<Responsability> findBySectionId(Long sectionId);
}
