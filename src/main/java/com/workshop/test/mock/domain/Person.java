package com.workshop.test.mock.domain;

import java.math.BigDecimal;

public class Person {

    private final String firstName;
    private final String lastName;

    private BigDecimal salary;

    public Person(final String firstName, final String lastName, final BigDecimal salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(final BigDecimal salary) {
        this.salary = salary;
    }
}
