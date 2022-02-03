package com.capg.service;

import com.capg.model.Enrollment;

public interface UsTestService  {
	
	public Enrollment saveEnrollment(Enrollment Testenroll);
	
	public Enrollment fetchTestByCourseName(String courseType);
	
	public Enrollment updateTestEnrollment(Integer testid, Enrollment testenrollment);
}
