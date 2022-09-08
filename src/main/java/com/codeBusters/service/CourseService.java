package com.codeBusters.service;

import com.codeBusters.database.Database;
import com.codeBusters.entity.Course;
import com.codeBusters.entity.Student;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CourseService implements CRUDService<Course>{

    @Override

    public Course findById(int id) {
        return Database.courseList.stream()
                .filter(course -> course.getId() == id)
                .findFirst().get();
    }


    @Override
    public List<Course> findAll() {
        return Database.courseList.stream()
                .filter(course -> course.getMinScore()<70).collect(Collectors.toList());
    }

    @Override
    public void save(Course course) {
    Database.courseList.stream().collect(Collectors.toMap((Course::getName),(Course::getMinScore)));

    }

    @Override
    public void update(Course course) {

    }

    @Override
    public void deleteById(Long id) {

            findAll().removeIf(course -> course.getId()==id);


    }
}
