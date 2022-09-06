package com.codeBusters.service;

import com.codeBusters.database.Database;
import com.codeBusters.entity.School;
import com.codeBusters.entity.Student;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.stream.Collectors;

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
        if(!Database.studentList.contains(student.getId())){
            Database.studentList.add(student);
        }
    }

    @Override
    public void update(Student student) {

        Student studentToUpdate = findById(student.getId());
        studentToUpdate.setFirstName(student.getFirstName());
        studentToUpdate.setLastName(student.getLastName());
        studentToUpdate.setStudentNumber(student.getStudentNumber());
        studentToUpdate.setCourses(student.getCourses());
        studentToUpdate.setParent(student.getParent());


    }

    @Override
    public void deleteById(Long id) {
        Database.studentList.removeIf(student -> student.getId()==id);
    }
}
