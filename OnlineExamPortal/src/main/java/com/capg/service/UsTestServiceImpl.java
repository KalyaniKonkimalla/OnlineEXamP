package com.capg.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.model.Enrollment;
import com.capg.repository.UsTestRepository;

@Service
public class UsTestServiceImpl implements UsTestService {

	@Autowired
	private UsTestRepository testrepository;

	@Override
	public Enrollment saveEnrollment(Enrollment Testenroll) {
		return testrepository.save(Testenroll);
	}

	@Override
	public Enrollment fetchTestByCourseName(String courseType){
		return testrepository.findByCourseTypeIgnoreCase(courseType);
	}

	@Override
	public Enrollment updateTestEnrollment(Integer testid, Enrollment testenrollment) {
		Enrollment teen=testrepository.findById(testid).get();
		if(Objects.nonNull(testenrollment.getCourseType()) &&
				!"".equalsIgnoreCase(testenrollment.getCourseType()))
		{
			teen.setCourseType(testenrollment.getCourseType());
		}
		
		if(Objects.nonNull(testenrollment.getStatusCheck()) &&
				!"".equalsIgnoreCase(testenrollment.getStatusCheck()))
		{
			teen.setStatusCheck(testenrollment.getStatusCheck());
		}
		
		return testrepository.save(teen);
	}
	}
