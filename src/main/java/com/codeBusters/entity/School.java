package com.codeBusters.entity;

import lombok.*;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class School extends BaseEntity {

    private String name;
    private List<Student> students;
    private List<Course> courses;

    public School(int id, String name, List<Student> students, List<Course> courses) {
        super(id);
        this.name = name;
        this.students = students;
        this.courses = courses;
    }
}
