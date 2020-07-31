package repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entities.Courses;

@Repository
public interface CoursesRepository extends CrudRepository<Courses,String>  {
	
	public List<Courses> findByTopicTopicId(String topicId);

}
