package com.ancons.universityRecommendations.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ancons.universityRecommendations.model.AcademicHistory;

public interface AcademicHistoryRepository extends JpaRepository<AcademicHistory, Long> {
	List<AcademicHistory> findAllByStudentId(Long id);
}
