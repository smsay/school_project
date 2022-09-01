package com.codeBusters;

import com.codeBusters.entity.Course;
import com.codeBusters.entity.Parent;
import com.codeBusters.entity.School;
import com.codeBusters.entity.Student;
import com.codeBusters.service.*;

public class SchoolMainRunner {

   public static CRUDService<School> schoolService;
   public static CRUDService<Course> courseService;
   public static CRUDService<Parent> parentService;
    public static CRUDService<Student> studentService;

    static {
        SchoolMainRunner.schoolService = new SchoolService();
       SchoolMainRunner.courseService = new CourseService();
       SchoolMainRunner.parentService = new ParentService();
       SchoolMainRunner.studentService = new StudentService();
    }

    public static void main(String[] args) {


    }


}
