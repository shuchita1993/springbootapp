package topics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import entities.Topic;

@RestController
public class TopicController {
	@Autowired
	TopicService service;
	@RequestMapping("/topics")
	public List<Topic> getTopics(){
		return service.getTopics();
	}
	/*@RequestMapping("/topics/{id}")
	public Topic getTopicById(@PathVariable String id){
		return service.getTopicsById(id);
	}*/
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Topic t){
		 service.addTopic(t);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void updateTopic(@RequestBody Topic t,@PathVariable String id){
		 service.updateTopic(t,id);
	}
	/*@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopic(@PathVariable String id){
		 service.delete(id);
	}*/

}
