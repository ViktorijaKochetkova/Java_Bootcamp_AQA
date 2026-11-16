package org.example;

public class FindInArray {
    public static void main(String[] args) {

        int[] num = {5, 12, 8, 25, 3};

        int largest = num[0];

        for ( int i = 1; i <num.length; i++) {

            if (num[i] > largest) {
                largest = num[i];
            }
        }

        System.out.println(largest);

    }
}
