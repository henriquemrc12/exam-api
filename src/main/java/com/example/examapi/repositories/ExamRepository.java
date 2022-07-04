package com.example.examapi.repositories;

import com.example.examapi.models.ExamModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<ExamModel, Long> {
}
