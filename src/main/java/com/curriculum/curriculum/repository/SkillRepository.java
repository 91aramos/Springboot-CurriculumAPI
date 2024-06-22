package com.curriculum.curriculum.repository;


import com.curriculum.curriculum.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}
