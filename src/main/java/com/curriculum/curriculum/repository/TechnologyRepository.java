package com.curriculum.curriculum.repository;


import com.curriculum.curriculum.entity.Technology;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TechnologyRepository extends JpaRepository<Technology, Long> {
}
