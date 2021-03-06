package com.company.ID003_Prime_Factor;

public class ID003 {

    public static void main(String[] args) {

        int lpf = 2;
        long num = 600851475143L;
        while (num > lpf) {
            if (num % lpf == 0) {
                num /= lpf;
                lpf = 2;
            } else {
                lpf++;
            }
        }
        System.out.println("Largest prime factor is " + Integer.toString(lpf));

//        TODO toto podtym je na hladanie sequencie prime numbers

//        int i;
//        int num = 0;
//        long maxCheck = 600851475143L; // maxCheck limit till which you want to find prime numbers
//        boolean isPrime = true;
//
//        //Empty String
//        String primeNumbersFound = "";
//
//        //Start loop 1 to maxCheck
//        for (i = 1; i <= maxCheck; i++) {
//            isPrime = CheckPrime(i);
//            if (isPrime) {
//                primeNumbersFound = primeNumbersFound + i + " ";
//            }
//        }
//        System.out.println("Prime numbers from 1 to " + maxCheck + " are:");
//        // Print prime numbers from 1 to maxCheck
//        System.out.println(primeNumbersFound);
//    }
//    public static boolean CheckPrime(int numberToCheck) {
//        int remainder;
//        for (int i = 2; i <= numberToCheck / 2; i++) {
//            remainder = numberToCheck % i;
//            //if remainder is 0 than numberToCheckber is not prime and break loop. Elese continue loop
//            if (remainder == 0) {
//                return false;
//            }
//        }
//        return true;

    }

}

