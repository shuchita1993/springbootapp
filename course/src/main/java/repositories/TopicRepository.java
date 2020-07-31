package repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import entities.Topic;

@Repository
public interface TopicRepository extends CrudRepository<Topic,String>  {

}
