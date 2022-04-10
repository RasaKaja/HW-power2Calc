package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the power of 2 calculator!");
        Power2Calc pw2 = new Power2Calc();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input please a random number:");
        int number = scanner.nextInt();
        pw2.number = number;

        pw2.Pwr2Calc();
    }
}
