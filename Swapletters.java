/*
Problem: Swap First and Last Character of a String

Description:
Write a program to swap the first and last characters of a given string.
If the string contains only one character, return the string as it is without any changes.

Input:
hello

Output:
oellh
*/


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();

        char[] arr = s.toCharArray();
        char temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        String result = new String(arr);
        System.out.println("Result is " + result);
    }
}
