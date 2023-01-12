package com.example.usecase;

import com.example.domain.entity.Person;
import com.example.usecase.port.PersonRepository;
import org.springframework.stereotype.Component;

@Component
public class UpdatePerson {
    private final PersonRepository repository;
    private final PersonFactory personFactory;

    public UpdatePerson(PersonRepository repository, PersonFactory personFactory) {
        this.repository = repository;
        this.personFactory = personFactory;
    }
    public void update(Person person){
        repository.update(personFactory.createPersonPO(person));
    }
}
