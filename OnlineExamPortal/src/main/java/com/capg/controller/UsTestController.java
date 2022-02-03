package com.capg.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.model.Enrollment;
import com.capg.service.UsTestService;

@RestController
public class UsTestController {
	
	@Autowired
	private UsTestService TestService;
	
	@PostMapping("/saveEnrollment")
	public Enrollment saveEnrollement(@Valid @RequestBody Enrollment Testenroll)
	{
		
		return TestService.saveEnrollment(Testenroll);
	}
	
	@GetMapping("/saveEnrollment/courseType/{courseType}")
	public Enrollment fetchTestByCourseName(@PathVariable("courseType") String courseType)
	{
		return TestService.fetchTestByCourseName(courseType);
	}
	
	@PutMapping("/saveEnrollment/{tid}")
	public Enrollment updateTestEnrollment(@PathVariable("tid") Integer testid,
												@RequestBody Enrollment testenrollment)
	{
		return TestService.updateTestEnrollment(testid,testenrollment);
	}

}
