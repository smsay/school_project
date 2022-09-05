package com.codeBusters.service;

import com.codeBusters.database.Database;
import com.codeBusters.entity.Student;

import javax.xml.crypto.Data;
import java.util.List;

public class StudentService implements CRUDService<Student>{

    @Override
    public Student findById(int id) {
        return Database.studentList.stream()
                .filter(student -> student.getId() == id)
                .findFirst().get();
    }

    @Override
    public List<Student> findAll() {
        return Database.studentList;
    }

    @Override
    public void save(Student student) {
        Database.studentList.add(student);
    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
