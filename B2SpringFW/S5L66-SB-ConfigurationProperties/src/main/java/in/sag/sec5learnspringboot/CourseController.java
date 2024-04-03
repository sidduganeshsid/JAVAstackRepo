package in.sag.sec5learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Courses> retriveAllCourses(){
		return Arrays.asList(
				new Courses(1l, "Learn JavaSE","Abdul Bari"),
				new Courses(2l, "Learn Spring  SpringBoot","Ranga")
				);
		
	}
	
	
}
