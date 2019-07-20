package com.workshop.test.jacoco;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringUtilsTest {

    private StringUtils stringUtils;

    @Before
    public void setUp() {
        stringUtils = new StringUtils("");
    }

    @Test
    public void should_return_true_giving_an_empty_string_when_checking_empty() {

        boolean result = stringUtils.isEmpty("");

        assertThat(result).isTrue();
    }

    @Test
    public void should_return_true_giving_nul_when_checking_empty() {

        boolean result = stringUtils.isEmpty(null);

        assertThat(result).isTrue();
    }

    @Test
    public void should_return_false_giving_A_when_checking_empty() {

        boolean result = stringUtils.isEmpty("a");

        assertThat(result).isFalse();
    }

    @Test
    public void should_return_true_giving_null_when_checking_blank() {

        boolean result = stringUtils.isBlank(null);

        assertThat(result).isTrue();
    }

    @Test
    public void should_return_true_giving_an_empty_string_when_checking_blank() {

        boolean result = stringUtils.isBlank("");

        assertThat(result).isTrue();
    }

    @Test
    public void should_return_false_giving_A_when_checking_blank() {

        boolean result = stringUtils.isBlank("a");

        assertThat(result).isFalse();
    }

    @Test
    public void should_return_true_giving_a_space_when_checking_blank() {

        boolean result = stringUtils.isBlank(" ");

        assertThat(result).isTrue();
    }

    @Test
    public void should_return_false_giving_a_empty_string_when_checking_alpha() {

        boolean result = stringUtils.isAlpha("");

        assertThat(result).isFalse();
    }

    @Test
    public void should_return_false_giving_a_space_string_when_checking_alpha() {

        boolean result = stringUtils.isAlpha(" ");

        assertThat(result).isFalse();
    }

    @Test
    public void should_return_true_giving_A_string_when_checking_alpha() {

        boolean result = stringUtils.isAlpha("a");

        assertThat(result).isTrue();
    }
}