package com.codeBusters.service;

import com.codeBusters.database.Database;
import com.codeBusters.entity.School;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.NoSuchElementException;

@AllArgsConstructor
@NoArgsConstructor
public class SchoolService implements CRUDService <School>{

   @Override
    public School findById(int id) {

        return null;
    }

    @Override
    public List<School> findAll() {
        return Database.schoolList;
    }

    @Override
    public void save(School schoolToSave) {

    }


    @Override
    public void update(School o) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
