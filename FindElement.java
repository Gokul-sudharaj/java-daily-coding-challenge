
/*
Problem: Find Element in Array (Linear Search)

Description:
Write a program to search for a given element in an array.
If the element is found, print its index; otherwise, print "Not Found".

Input:
5
10 20 30 40 50
30

Output:
Element found at index 2
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
        int element = sc.nextInt();
        boolean founded = false;
        for (int i = 0; i < a; i++) {
            if (arr[i] == element) {
                System.out.println("Element found at index " + i);
                founded = true;
                break; 
            }
        }

        if (!founded ) {
            System.out.println("Element Not Found");
        }
    }
}
