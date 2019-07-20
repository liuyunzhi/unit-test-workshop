package com.workshop.test.mock.service;

import com.workshop.test.mock.domain.Person;
import com.workshop.test.mock.domain.PersonRequest;
import com.workshop.test.mock.utils.SalaryCalculator;
import com.workshop.test.mock.utils.TimeUnit;

import java.math.BigDecimal;

public class PersonService {

    public Person find(final PersonRequest request) {
        if (request.getName().equals("James")) {
            Person person = new Person("Merson", "James", BigDecimal.TEN);
            person.setSalary(SalaryCalculator.calculate(person.getSalary()));
            TimeUnit.sleep(5000);
            return person;
        }
        return new Person("None", "None", BigDecimal.ZERO);
    }
}
