package Repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.capg.model.Enrollment;
import com.capg.repository.UsTestRepository;
import com.capg.service.UsTestService;

@SpringBootTest
class EnrollmentServiceTest{
	
	@Autowired
	private UsTestService ustestService;
	
	@MockBean
	private  UsTestRepository ustestRepository;
	
	
	
	@BeforeEach
	void setUp()
	{
		Enrollment enrollment= Enrollment.builder()
				               .course_id(1)
				               .test_id(3)
				               .courseType("java")
				               .statusCheck("yes")
				               .build();
		Mockito.when(ustestRepository.findByCourseTypeIgnoreCase("java")).thenReturn(enrollment);
	}
	
	@Test
	public void whenValidCoursetype_thenCoursetypeShouldFound()
	{
		String courseType="java";
		Enrollment found= ustestService.fetchTestByCourseName(courseType);
		
		assertEquals(courseType,found.getCourseType());
	}
	
}
