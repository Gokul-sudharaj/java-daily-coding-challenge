/*
Problem: Sum of Digits Until Single Digit

Description:
Given an integer, repeatedly find the sum of its digits
until the result becomes a single-digit number.

Input:
9875

Output:
2
*/

import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the digits ");
        int digit  = sc.nextInt();
        int original  = digit;
        while(digit >= 10){
        int sum = 0;
        while(digit > 0){
            int n = digit % 10;
            sum = sum+n;
            digit = digit / 10;
        }
        digit = sum ;
        }
        System.out.println("Sum of the " + original + " is = " + digit);
    }
}
