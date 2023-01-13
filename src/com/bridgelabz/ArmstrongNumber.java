package com.bridgelabz;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number.");
        int number = scanner.nextInt();
        int refNum1 = number;
        int length = 0;
        while (refNum1 != 0) {
            refNum1 = refNum1 / 10;
            length = length + 1;
        }
        int refNum2 = number;
        int remainder = 0;
        int armstrongNumber = 0;
        while (refNum2 != 0) {
            remainder = refNum2 / 10;
            int multiply = 1;
            for (int i = 1; i <= length; i++) {
                multiply = multiply * remainder;
            }
            armstrongNumber = armstrongNumber + multiply;
            refNum2 = refNum2 / 10;
        }
        if (number == armstrongNumber) {
            System.out.println("it;s an armstrong number.");
        } else {
            System.out.println("it's not an armstrong number.");
        }

    }
}
