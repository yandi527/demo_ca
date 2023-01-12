package com.example.usecase;

import com.example.domain.entity.Person;
import com.example.usecase.port.PersonRepository;
import org.springframework.stereotype.Component;

@Component

public class FindPerson {
    private final PersonRepository repository;
    private final PersonFactory personFactory;

    public FindPerson(PersonRepository repository, PersonFactory personFactory) {
        this.repository = repository;
        this.personFactory = personFactory;
    }

    public Person findById(String id){
        var personPO = repository.findById(id);
        return personFactory.getPerson(personPO);
    }
}
