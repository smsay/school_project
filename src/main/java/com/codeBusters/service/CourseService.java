package com.codeBusters.service;

import com.codeBusters.database.Database;
import com.codeBusters.entity.Course;
import com.codeBusters.entity.Student;

import java.util.List;

public class CourseService implements CRUDService<Course>{

    @Override

    public Course findById(int id) {
        return Database.courseList.stream()
                .filter(course -> course.getId() == id)
                .findFirst().get();
    }


    @Override
    public List<Course> findAll() {
        return null;
    }

    @Override
    public void save(Course course) {

    }

    @Override
    public void update(Course course) {

    }

    @Override
    public void deleteById(Long id) {

            findAll().removeIf(course -> course.getId()==id);

    }
}
