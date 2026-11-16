package sef.module4.activity;

public class Calculator {

    private String calculatorType;

    public static final String CALC_TYPE_BASIC = "Basic";

    public Calculator() {
        calculatorType = CALC_TYPE_BASIC;
    }

    public Calculator(String type) {
        calculatorType = type;
    }

    public String getCalculatorType() {
        return calculatorType;
    }

    public void setCalculatorType(String type) {
        calculatorType = type;
    }

    public int add(int a, int b) {
        int res = a + b;
        return res;
    }

    public int subtract(int a, int b) {
        int res = 0;

        if (a > b) {
            res = a - b;
        } else {
            res = b - a;
        }

        return res;
    }

    public int multiply(int[] num) {
        int res= 1;

        for (int i = 0; i < num.length; i++) {
            res = res * num[i];
        }

        return res;
    }

    public int divide(int a, int b) {
        int res = 0;

        if (b != 0) {
            res = a / b;
        } else {
            System.out.println("Cannot divide by zero");
        }

        return res;
    }
}
