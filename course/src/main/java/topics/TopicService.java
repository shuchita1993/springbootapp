package topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Topic;
import repositories.TopicRepository;

@Service
public class TopicService {
	 List<Topic> l=new ArrayList<>( Arrays.asList(new Topic("1","ds"),new Topic("10","ada")));
	 
	@Autowired
	private TopicRepository r;
	
	public List<Topic> getTopics(){
		List<Topic> topics=new ArrayList<Topic>();
		r.findAll().forEach(topics::add);
		return topics;
	}
	public void addTopic(Topic t){
		r.save(t);
	}
/*	public Topic getTopicsById(String id){
		//return l.stream().filter(t->t.getTopicId().equalsIgnoreCase(id)).findFirst().get();
		return r.findOne(id);
	}*/
	
	public void updateTopic(Topic t,String id){
		/*for(int i=0;i<l.size();i++){
			if(l.get(i).getTopicId().equals(id)){
				l.get(i).setTopicDesc(t.getTopicDesc());
			}
		}*/
		r.save(t);
	}
	/*public void delete(String id){
		for(int i=0;i<l.size();i++){
			if(l.get(i).getTopicId().equals(id)){
				l.remove(l.get(i));
			}
		}
		r.delete(id);
	}*/
}
