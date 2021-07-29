package com.siddharth.CourseApi.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {

	//we need a method that takes in topic id and returns courses
	
	public List<Course> findByTopicId(String topicId);
	 
}
