package com.example.usecase;

import com.example.domain.entity.Person;
import com.example.usecase.port.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreatePerson {
    @Autowired
    PersonRepository repository;
    @Autowired
    PersonFactory personFactory;

    public void create(Person person) {
        repository.insert(personFactory.createPersonPO(person));
    }
}
