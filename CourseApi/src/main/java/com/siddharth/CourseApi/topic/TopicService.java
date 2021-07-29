package com.siddharth.CourseApi.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepo;
	
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		topicRepo.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id){
		Topic t = topicRepo.findById(id).get();
		return t;
	}

	public void addTopic(Topic t) {
		topicRepo.save(t); 
		
	}

	public void updateTopic(String id, Topic topic) {
		topicRepo.save(topic); // save does update here
	}

	public void deleteTopic(String id) {
		topicRepo.deleteById(id);
	}
}
