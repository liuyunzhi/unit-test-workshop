package com.workshop.test.jacoco;

import org.junit.Before;
import org.junit.Test;

import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LocaleUtilsTest {

    private LocaleUtils localeUtils;

    @Before
    public void setUp() {
        localeUtils = new LocaleUtils();
    }

    @Test
    public void should_return_null_giving_null() {

        Locale locale = localeUtils.toLocale(null);

        assertThat(locale).isNull();
    }

    @Test
    public void should_return_a_empty_locale_giving_an_empty_string() {

        Locale locale = localeUtils.toLocale("");

        assertThat(locale).isEqualTo(new Locale("", ""));
    }

    @Test
    public void should_throw_illegal_argument_exception_giving_a_string_contains_number_sign() {

        assertThatThrownBy(() -> localeUtils.toLocale("#"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Invalid locale format: #");
    }

    @Test
    public void should_throw_illegal_argument_exception_giving_a_string_which_is_length_less_than_two() {

        assertThatThrownBy(() -> localeUtils.toLocale("_"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Invalid locale format: _");
    }

    @Test
    public void should_throw_illegal_argument_exception_giving_a_string_which_is__c() {

        assertThatThrownBy(() -> localeUtils.toLocale("_c"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Invalid locale format: _c");
    }

    @Test
    public void should_throw_illegal_argument_exception_giving_a_string_which_is__cN() {

        assertThatThrownBy(() -> localeUtils.toLocale("_cN"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Invalid locale format: _cN");
    }

    @Test
    public void should_throw_illegal_argument_exception_giving_a_string_which__Cn() {

        assertThatThrownBy(() -> localeUtils.toLocale("_Cn"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Invalid locale format: _Cn");
    }

    @Test
    public void should_return_a_locale_witch_is_empty_language_giving_a_string_which_is__CN() {

        Locale locale = localeUtils.toLocale("_CN");

        assertThat(locale).isEqualTo(new Locale("", "CN"));
    }

    @Test
    public void should_throw_illegal_argument_exception_giving_a_string_which_is__CN_() {

        assertThatThrownBy(() -> localeUtils.toLocale("_CN_"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Invalid locale format: _CN_");
    }

    @Test
    public void should_throw_illegal_argument_exception_giving_a_string_which_is__CHINA() {

        assertThatThrownBy(() -> localeUtils.toLocale("_CHINA"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Invalid locale format: _CHINA");
    }

    @Test
    public void should_return_a_locale_which_is_empty_language_giving_a_string_which_is__JP_J() {

        Locale locale = localeUtils.toLocale("_JP_J");

        assertThat(locale).isEqualTo(new Locale("", "JP", "J"));
    }

    @Test
    public void should_return_a_locale_giving_a_string_which_is_zh() {

        Locale locale = localeUtils.toLocale("zh");

        assertThat(locale).isEqualTo(Locale.CHINESE);
    }

    @Test
    public void should_return_a_locale_giving_a_string_which_is_zh_CN() {

        Locale locale = localeUtils.toLocale("zh_CN");

        assertThat(locale).isEqualTo(Locale.CHINA);
    }

    @Test
    public void should_throw_illegal_argument_exception_giving_a_string_which_is_ZH_CN() {

        assertThatThrownBy(() -> localeUtils.toLocale("ZH_CN"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Invalid locale format: ZH_CN");
    }

    @Test
    public void should_throw_illegal_argument_exception_giving_a_string_which_is_zh_cn() {

        assertThatThrownBy(() -> localeUtils.toLocale("zh_cn"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Invalid locale format: zh_cn");
    }

    @Test
    public void should_return_a_locale_giving_a_string_which_is_en_202() {

        Locale locale = localeUtils.toLocale("en_202");

        assertThat(locale).isEqualTo(new Locale("en", "202"));
    }

    @Test
    public void should_throw_illegal_argument_exception_giving_a_string_which_is_zh_() {

        assertThatThrownBy(() -> localeUtils.toLocale("zh_"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Invalid locale format: zh_");
    }

    @Test
    public void should_return_a_local_giving_a_string_which_is_jp__JP() {

        Locale locale = localeUtils.toLocale("jp__JP");

        assertThat(locale).isEqualTo(new Locale("jp", "", "JP"));
    }

    @Test
    public void should_return_a_locale_giving_a_string_which_is_jap_JP_JP() {

        Locale locale = localeUtils.toLocale("jap_JP_JP");

        assertThat(locale).isEqualTo(new Locale("jap", "JP", "JP"));
    }

    @Test
    public void should_return_a_local_giving_a_string_which_is_en_202_DC() {

        Locale locale = localeUtils.toLocale("en_202_DC");

        assertThat(locale).isEqualTo(new Locale("en", "202", "DC"));
    }

    @Test
    public void should_throw_illegal_argument_exception_giving_a_string_which_is_japan_JP_JP() {

        assertThatThrownBy(() -> localeUtils.toLocale("japan_JP_JP"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Invalid locale format: japan_JP_JP");
    }

    @Test
    public void should_throw_illegal_argument_exception_giving_a_string_which_is_jp_JAP_JP() {

        assertThatThrownBy(() -> localeUtils.toLocale("jp_JAP_JP"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Invalid locale format: jp_JAP_JP");
    }

    @Test
    public void should_throw_illegal_argument_exception_giving_a_string_which_is_en_2020_DC() {

        assertThatThrownBy(() -> localeUtils.toLocale("en_2020_DC"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Invalid locale format: en_2020_DC");
    }

    @Test
    public void should_throw_illegal_argument_exception_giving_a_string_which_is_en_202_() {

        assertThatThrownBy(() -> localeUtils.toLocale("en_202_"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Invalid locale format: en_202_");
    }

    @Test
    public void should_throw_illegal_argument_exception_giving_a_string_which_is_jp_JP_JP_() {

        assertThatThrownBy(() -> localeUtils.toLocale("jp_JP_JP_"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Invalid locale format: jp_JP_JP_");
    }
}