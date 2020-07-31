package courses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Courses;
import repositories.CoursesRepository;

@Service
public class CourseService {
	 
	@Autowired
	private CoursesRepository re;
	
	public List<Courses> getCourses(String topicId){
		List<Courses> courses=new ArrayList<Courses>();
		re.findByTopicTopicId(topicId)
				.forEach(courses::add);
		return courses;
	}
	public void addCourse(Courses t){
		re.save(t);
	}
	/*public Courses getCoursesById(String id){
		//return l.stream().filter(t->t.getTopicId().equalsIgnoreCase(id)).findFirst().get();
		return re.findById(id);
	}*/
	
	public void updateCourse(Courses t){
		re.save(t);
	}
	/*public void deleteCourse(String id){
		re.delete(id);
	}*/
}
