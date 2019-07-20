package com.workshop.test.mock.controller;

import com.workshop.test.mock.domain.Person;
import com.workshop.test.mock.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class PersonControllerTest {

    @InjectMocks
    private PersonController personController;

    @Mock
    private PersonService personService;

    @Test
    public void should_return_full_name_giving_first_name() {
        // given
        String firstName = "Martin";
        given(personService.find(argThat(arg -> firstName.equals(arg.getName()))))
                .willReturn(new Person(firstName, "Fowler", BigDecimal.ZERO));

        // when
        String result = personController.getName(firstName);

        // then
        assertThat(result).isEqualTo("Martin,Fowler");
    }
}