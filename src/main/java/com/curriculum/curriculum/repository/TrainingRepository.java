package com.curriculum.curriculum.repository;

import com.curriculum.curriculum.entity.Training;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingRepository extends JpaRepository<Training, Long> {
}