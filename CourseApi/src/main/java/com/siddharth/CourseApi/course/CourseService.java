package com.siddharth.CourseApi.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepo;
	
	public List<Course> getAllcourses(String topicId){
		List<Course> courses = new ArrayList<>();
		courseRepo.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String id){
		Course c = courseRepo.findById(id).get();
		return c;
	}

	public void addCourse(Course t) {
		courseRepo.save(t); 
		
	}

	public void updateCourse(Course course) {
		courseRepo.save(course); // save does update here
	}

	public void deleteCourse(String id) {
		courseRepo.deleteById(id);
	}
}
