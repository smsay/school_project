package com.codeBusters.service;

import com.codeBusters.database.Database;
import com.codeBusters.entity.School;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.NoSuchElementException;

@AllArgsConstructor
//@NoArgsConstructor
public class SchoolService implements CRUDService<School> {

    @Override
    public School findById(int id) {
          return findAll().stream()
                  .filter(school -> school.getId()==id)
                  .findFirst().orElseThrow(()->new NoSuchElementException("There is no School with id "+id));

    }

    @Override
    public List<School> findAll() {
        return Database.schoolList;
    }

    @Override
    public void save(School schoolToSave) {
        if (findAll().stream().anyMatch(school -> school.equals(schoolToSave))) {
            System.err.println("This school is already in the list " + schoolToSave);
        } else Database.schoolList.add(schoolToSave);
    }


    @Override
    public void update(School o) {

        School schoolToUpdate= findById(o.getId());
        schoolToUpdate.setName(o.getName());
        schoolToUpdate.setStudents(o.getStudents());
        schoolToUpdate.setCourses(o.getCourses());


    }

    @Override
    public void deleteById(Long id) {

    }
}
