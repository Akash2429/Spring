package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;


@Service
public class CourseServiceImpl implements CourseService {

	
	List<Course> list;
	
	public CourseServiceImpl()
	{
		list= new ArrayList<>();
		list.add(new Course(1,"Java","This is java Course"));
		list.add(new Course(2,"Python","This is Python Course"));
		
	}
	
	
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}



	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

     @Override
     public Course updateCourse(Course course)
     {
    	 list.forEach(e->
    	 {
    		 if (e.getId()==course.getId()) {
    			 e.setTitle(course.getTitle());
    			 e.setDiscription(course.getDiscription());
    		 }
    	 });
    	 return course;
     }
	
	@Override
	public Course deleteCourse(Course course) {
		// TODO Auto-generated method stub
		list.remove(course);
		return course;
	}

}
