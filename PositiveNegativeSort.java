
/*
Problem: Sort Positive and Negative Numbers in an Array

Description:
Write a program to arrange the numbers in an array such that
all negative numbers appear first followed by all positive numbers.

Input:
6
3 -2 5 -7 1 -4

Output:
-2 -7 -4 3 5 1
*/


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
