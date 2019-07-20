package com.workshop.test.mock.service;

import com.workshop.test.mock.domain.Person;
import com.workshop.test.mock.domain.PersonRequest;
import com.workshop.test.mock.utils.SalaryCalculator;
import com.workshop.test.mock.utils.TimeUnit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.core.classloader.annotations.SuppressStaticInitializationFor;
import org.powermock.modules.junit4.PowerMockRunner;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.given;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.support.membermodification.MemberMatcher.method;
import static org.powermock.api.support.membermodification.MemberModifier.suppress;

@RunWith(PowerMockRunner.class)
@PrepareForTest(TimeUnit.class)
@SuppressStaticInitializationFor("com.workshop.test.mock.utils.SalaryCalculator")
public class PersonServiceTest {

    @InjectMocks
    private PersonService personService;

    @Test
    public void should_return_a_unknown_person_giving_the_name_is_not_James() {
        // given

        // when
        Person person = personService.find(new PersonRequest("Martin"));

        // then
        assertThat(person.getFirstName()).isEqualTo("None");
    }

    @Test
    public void should_return_a_person_named_James_giving_the_name_is_James() {
        // given
        suppress(method(TimeUnit.class, "sleep"));
        mockStatic(SalaryCalculator.class);
        given(SalaryCalculator.calculate(eq(BigDecimal.TEN)))
                .willReturn(BigDecimal.valueOf(20));

        // when
        Person person = personService.find(new PersonRequest("James"));

        // then
        assertThat(person.getLastName()).isEqualTo("James");
    }
}