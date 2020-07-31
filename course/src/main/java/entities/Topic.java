package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TOPIC")
public class Topic {
	
	String topicId;
	String topicDesc;
	
	public Topic(String topicId, String topicDesc) {
		super();
		this.topicId = topicId;
		this.topicDesc = topicDesc;
	}
	
	@Id
	@Column(name = "TOPIC_ID")
	public String getTopicId() {
		return topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}
	
	@Column(name = "TOPIC_DESC")
	public String getTopicDesc() {
		return topicDesc;
	}

	public void setTopicDesc(String topicDesc) {
		this.topicDesc = topicDesc;
	}

	public Topic() {
	}
	

}
