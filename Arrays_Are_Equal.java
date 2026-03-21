
/*
Problem: Check if Two Arrays are Equal After Sorting

Description:
Given two arrays of integers, determine whether they contain
the same elements after sorting. If both arrays have the same
elements in the same quantity, they are considered equal.

Input:
Array1: 3 1 2
Array2: 2 3 1

Output:
Arrays are Equal
*/


import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        System.out.println("Enter the array 1 Elements");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the array 2 Elements");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr2[i] > arr2[j]) {
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        boolean isEqual = true;
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                isEqual = false;
                break;
            }
        }
        if (isEqual) {
            System.out.println("Arrays are Equal");
        } else {
            System.out.println("Arrays are Not Equal");
        }
    }
}
