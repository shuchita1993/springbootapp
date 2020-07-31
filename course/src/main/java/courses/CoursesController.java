package courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import entities.Courses;
import entities.Topic;

@RestController
public class CoursesController {
	@Autowired
	CourseService service;
	@CrossOrigin(origins="http://localhost:4200")  
	@RequestMapping("/topics/{id}/courses")
	public List<Courses> getCourses(@PathVariable String id){
		return service.getCourses(id);
	}
	/*@RequestMapping("/topics/{id}/courses/{courseid}")
	public Courses getCourseById(@PathVariable String courseid){
		return service.getCoursesById(courseid);
	}*/
	@RequestMapping(method=RequestMethod.POST,value="/topics/{id}/courses")
	public void addCourse(@RequestBody Courses t,@PathVariable String id){
		 t.setTopic(new Topic(id, ""));
		 service.addCourse(t);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}/courses/{courseid}")
	public void updateCourse(@RequestBody Courses t){
		 service.updateCourse(t);
	}
	/*@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}/courses/{courseid}")
	public void deleteCourse(@PathVariable String courseid){
		 service.deleteCourse(courseid);
	}*/

}
