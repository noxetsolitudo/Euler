package com.company.ID001_Multiples_of_3_and_5;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int _multiplier = 0;
        int _numberBeingDivided = 0;

        System.out.println("Please insert the multiplier: ");
        _multiplier = scanner.nextInt();
        System.out.println("Please insert the number you are looking to " +
                "multiply multiplier in: ");
        _numberBeingDivided = scanner.nextInt();

        ID001 id001 = new ID001(_multiplier, _numberBeingDivided);
        id001.funcion();

    }
}

