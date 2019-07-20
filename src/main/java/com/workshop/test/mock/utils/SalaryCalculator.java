package com.workshop.test.mock.utils;

import java.math.BigDecimal;

public class SalaryCalculator {

    static {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static BigDecimal calculate(BigDecimal salary) {
        TimeUnit.sleep(7000);
        return salary.add(BigDecimal.TEN);
    }
}
