package com.example.application.spring.controller;

import com.example.adapter.controller.PersonController;
import com.example.adapter.dto.PersonDTO;
import com.example.infrastructure.common.api.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@RestController
@RequestMapping("/person")
@Slf4j
public class SpringPersonController {
    @Autowired
    PersonController controller;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Response create(@RequestBody PersonDTO personDTO) {
        try {
            controller.createPerson(personDTO);
            return Response.ok();
        } catch (ParseException e) {
            log.error("", e);
            return Response.failed(e.getMessage());
        }
    }

    @PutMapping
    public Response update(@RequestBody PersonDTO personDTO) {
        try {
            controller.createPerson(personDTO);
            return Response.ok();
        } catch (ParseException e) {
            log.error("", e);
            return Response.failed(e.getMessage());
        }
    }

    @DeleteMapping("/{personId}")
    public Response delete(@PathVariable String personId) {
        return Response.ok();
    }

    @GetMapping("/{personId}")
    public Response get(@PathVariable String personId) {
        return Response.ok(controller.findPersonById(personId));
    }
}
