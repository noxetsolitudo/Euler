package com.company.ID002_Even_Fibonacci_numbers;

public class ID002 {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int maxFib = 4000000;
        int fibSeq;
        int reminder = 0;
        int reminderSum = 0;

        System.out.println("Fib sequence : 0 ");

        for (int i = 0; i < 100; i++) {

            fibSeq = num1 + num2;
            num1 = num2;
            num2 = fibSeq;

            reminder = fibSeq % 2;

            if (reminder == 0) {
                reminderSum += fibSeq;
//                System.out.println("Reminder sum so far: " + reminderSum );
            }

            if (fibSeq > maxFib) {
                break;
            }

            System.out.println("Fib sequence: " + fibSeq + " ");
            System.out.println("Reminder sum so far: " + reminderSum);

        }
        System.out.println("Sum of all even numbers in fibonacci sequence of " + maxFib + " is : " + reminderSum);
    }
}

