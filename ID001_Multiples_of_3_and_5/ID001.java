package com.company.ID001_Multiples_of_3_and_5;

public class ID001 {
    //TODO Multiples of 3 and 5

    private int multiplier = 0;
    private int numberBeingDivided = 0;
    private int sum = 0;
    private int numberMultipliedSum = 0;

    public ID001(int multiplier, int numberBeingDivided) {
        this.multiplier = multiplier;
        this.numberBeingDivided = numberBeingDivided;
    }

    public void funcion() {
        for (int i = 1; i < numberBeingDivided; i++) {
            numberMultipliedSum = multiplier * i;
            sum += numberMultipliedSum;

            System.out.println("--Round No.--: " + i);
            System.out.println("Multiplication of " + multiplier + " :" + numberMultipliedSum);
            System.out.println("Partial sums of " + multiplier + " :" + sum);

            if (numberMultipliedSum > numberBeingDivided - multiplier) {//condition to break out of the cycle
                break;                                                  // - multiplier --> added to force the cycle to close before the numberBeingDivided
            }
        }
        System.out.println("Total Sum of multiplication of number " + multiplier + " in number "
                + numberBeingDivided + " is: " + sum);
    }
}

