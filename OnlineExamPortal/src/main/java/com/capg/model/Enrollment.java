package com.capg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//@Builder
@Entity
@Table(name="test_enroll")
public class Enrollment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="tid")
	private Integer tid;
	
	@Column(name="course_id")
	private int course_id;
	
	@Column(name="test_id")
	private int test_id;
	
	@NotBlank(message="please add courseType")
	@Column(name="Course_Name",length=20)
	private String courseType;

	@Column(name="Status",length=3)
	private String statusCheck;

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public int getTest_id() {
		return test_id;
	}

	public void setTest_id(int test_id) {
		this.test_id = test_id;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public String getStatusCheck() {
		return statusCheck;
	}

	public void setStatusCheck(String statusCheck) {
		this.statusCheck = statusCheck;
	}

//	public Enrollment(Integer tid, int course_id, int test_id,
//			@NotBlank(message = "please add courseType") String courseType, String statusCheck) {
//		super();
//		this.tid = tid;
//		this.course_id = course_id;
//		this.test_id = test_id;
//		this.courseType = courseType;
//		this.statusCheck = statusCheck;
//	}
//
//	public Enrollment() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	@Override
	public String toString() {
		return "Enrollment [tid=" + tid + ", course_id=" + course_id + ", test_id=" + test_id + ", courseType="
				+ courseType + ", statusCheck=" + statusCheck + "]";
	}
	
	
	



}
