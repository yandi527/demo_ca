package com.example.usecase;

import com.example.domain.entity.Person;
import com.example.domain.entity.po.PersonPO;
import com.example.usecase.port.PersonRepository;
import org.springframework.stereotype.Component;

@Component

public class DeletePerson {
    private final PersonRepository repository;
    private final PersonFactory personFactory;

    public DeletePerson(PersonRepository repository, PersonFactory personFactory) {
        this.repository = repository;
        this.personFactory = personFactory;
    }

    public void deleteById(String id) {
        PersonPO personPO = repository.findById(id);
        Person person = personFactory.getPerson(personPO);
        person.disable();
        repository.update(personFactory.createPersonPO(person));
    }

}
