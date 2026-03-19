/*
Problem: Find All Indices of a Given Element

Description:
Write a program to find and print all the indices of a given element in an array.
If the element is not present, print "Not Found".

Input:
6
1 2 3 2 4 2
2

Output:
1 3 5
*/


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int a = sc.nextInt();
        int[] arr = new int[a];
         System.out.println("Enter the elements:");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
         System.out.println("Enter the Searching Element:");
        int key = sc.nextInt();
        boolean found = false;
        System.out.print("The element " + key + " appears at indices ");
        for (int i = 0; i < a; i++) {
            if (arr[i] == key) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not Found");
        }
    }
}
