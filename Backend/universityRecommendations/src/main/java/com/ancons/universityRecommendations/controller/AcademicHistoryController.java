package com.ancons.universityRecommendations.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ancons.universityRecommendations.model.AcademicHistory;
import com.ancons.universityRecommendations.service.AcademicHistoryService;

@RestController
@RequestMapping("/api")
public class AcademicHistoryController {

	@Autowired
	private AcademicHistoryService academicHistoryService;
	
	@PutMapping("/{id}/createAcademicHistory")
	public ResponseEntity<Void> saveAcademicHistory(@RequestBody AcademicHistory academicHistory, @PathVariable Long id) {
		academicHistoryService.saveAcademicHistory(academicHistory, id);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/{id}/getAcademicHistory")
	public ResponseEntity<AcademicHistory> getAcademicHistory(@PathVariable Long id) {
		AcademicHistory academicHistory = academicHistoryService.getAcademicHistory(id);
		return ResponseEntity.ok(academicHistory);
	}
}
