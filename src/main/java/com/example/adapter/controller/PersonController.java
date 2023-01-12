package com.example.adapter.controller;

import com.example.infrastructure.util.PersonAssembler;
import com.example.adapter.dto.PersonDTO;
import com.example.usecase.CreatePerson;
import com.example.usecase.DeletePerson;
import com.example.usecase.FindPerson;
import com.example.usecase.UpdatePerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.text.ParseException;
@Controller
public class PersonController {
    @Autowired
    CreatePerson createPerson;
    @Autowired
    DeletePerson deletePerson;
    @Autowired
    FindPerson findPerson;
    @Autowired
    UpdatePerson updatePerson;
    public PersonDTO findPersonById(String id){
        return PersonAssembler.toDTO(findPerson.findById(id));
    }

    public void createPerson(PersonDTO personDTO) throws ParseException {
        createPerson.create(PersonAssembler.toDO(personDTO));
    }

    public void deletePerson(String id) {
        deletePerson.deleteById(id);
    }

    public void updatePerson(PersonDTO personDTO) throws ParseException {
        updatePerson.update(PersonAssembler.toDO(personDTO));
    }

}
