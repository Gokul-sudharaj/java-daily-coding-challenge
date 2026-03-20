/*
Problem: Check Whether a Number is Palindrome in Binary

Description:
Given an integer number, convert it into its binary representation
and check whether the binary value reads the same forward and backward.

Input:
9

Output:
Binary Palindrome
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the decimal no");
        int num = sc.nextInt();
        int original = num;
        int reversed = 0;
        while (num > 0) {
            int bit = num % 2;
            reversed = (reversed << 1) | bit;
            num = num / 2;
        }
        if (original == reversed) {
            System.out.println("Binary Palindrome");
        } else {
            System.out.println("Not a Binary Palindrome");
        }
    }
}
