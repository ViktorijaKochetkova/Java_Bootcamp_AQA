package org.example;

public class Calculator {
    public static void main(String[] args) {

        int a = 5;

        int b = 11;

        int[] nums = {1, 2, 3, 4};

        System.out.println("Addition - " + add(a, b));

        System.out.println("Substraction - " + subtract(a, b));

        System.out.println("Multiply - " + multiply(nums));

        System.out.println("Divide - " + divide(a, b));
    }

private static int add(int a, int b) {
        int sum = a + b;

        return sum;
}

private static int subtract(int a, int b) {
        int diff = a - b;

        return diff;
}

private static int multiply(int[] num) {

        int res = 1;

        for(int i = 0; i < num.length; i++) {

            res = res * num[i];
        }

        return res;
}

private static int divide(int a, int b) {

    if (b == 0) {
        System.out.println("Cannot divide by zero");
        return 0;
    }

    int res = a / b;

    return  res;
    }
}
