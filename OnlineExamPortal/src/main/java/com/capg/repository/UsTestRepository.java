package com.capg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.model.Enrollment;

public interface UsTestRepository extends JpaRepository<Enrollment, Integer> {
	
	
	public Enrollment findByCourseType(String courseType);
	
	public Enrollment findByCourseTypeIgnoreCase(String courseType);
}
