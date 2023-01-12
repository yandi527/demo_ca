package com.example.adapter.repository;

import com.example.domain.entity.po.PersonPO;

import com.example.usecase.port.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonRepositoryImpl implements PersonRepository {


    @Autowired
    PersonDao personDao;

    @Override
    public void insert(PersonPO personPO) {
        personDao.save(personPO);
    }

    @Override
    public void update(PersonPO personPO) {
        personDao.save(personPO);
    }

    @Override
    public PersonPO findById(String id) {
        var byId = personDao.findById(id);
        if (byId.isPresent()) {
            var personPO = byId.get();
            return personPO;
        } else {
            return null;
        }
    }

}
