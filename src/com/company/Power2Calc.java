package com.company;

public class Power2Calc {
    /** Write a program that takes a positive integer N - n (int) from the user, and then displays
     all powers of the number 2 in the console that are not greater than the number given (each number should be displayed in new line.
    For example, for the number 71 the program should write in the console the numbers: 1 2 4 8 16 32 64, in new line each.
    Get the data from the user in the console using the Scanner class.
    * */

    int i;
    int number;

    void Pwr2Calc () {
       for (i = 2; i <= number; i = i * 2) {
            System.out.println(i);
            //i = i * 2;
       }
    }
 }
