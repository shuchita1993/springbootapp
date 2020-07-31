package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="COURSES")
public class Courses {
	
	String courceId;
	String courseDesc;
	private Topic topic;
	
	public Courses(String courceId, String courseDesc, String topicId) {
		super();
		this.courceId = courceId;
		this.courseDesc = courseDesc;
		this.topic = new Topic(topicId,"");
	}
	public Courses() {
	}
	
	@Id
	@Column(name = "COURSE_ID")
	public String getCourceId() {
		return courceId;
	}
	public void setCourceId(String courceId) {
		this.courceId = courceId;
	}
	
	@Column(name = "COURSE_DESC")
	public String getCourseDesc() {
		return courseDesc;
	}
	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}
	
	@ManyToOne
	@JoinColumn(name = "TOPIC_ID")
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	

}
