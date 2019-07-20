package com.workshop.test.mock.domain;

public class PersonRequest {
    private String name;

    public PersonRequest(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
