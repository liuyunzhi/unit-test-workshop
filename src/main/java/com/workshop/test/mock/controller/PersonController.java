package com.workshop.test.mock.controller;


import com.workshop.test.mock.domain.Person;
import com.workshop.test.mock.domain.PersonRequest;
import com.workshop.test.mock.service.PersonService;

public class PersonController {

    private final PersonService personService;

    public PersonController(final PersonService personService) {
        this.personService = personService;
    }

    public String getName(String name) {
        PersonRequest request = new PersonRequest(name);
        Person person = personService.find(request);
        return person.getFirstName() + "," + person.getLastName();
    }

}
