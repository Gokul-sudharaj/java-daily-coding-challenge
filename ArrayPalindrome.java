
/*
Problem: Check Whether an Array is Palindrome

Description:
Write a program to check whether the given array is a palindrome.
An array is said to be a palindrome if it reads the same forward and backward.

Input:
5
1 2 3 2 1

Output:
Palindrome Array
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isPalindrome = true;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome Array");
        } else {
            System.out.println("Not a Palindrome Array");
        }
    }
}
