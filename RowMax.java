/*
Problem: Maximum Element in Each Row of a Matrix

Description:
Write a program to find the maximum element in each row of a given matrix.

Input:
2 3
1 5 3
4 2 6

Output:
5
6
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row Size");
        int r = sc.nextInt();
        System.out.println("Enter the Column Size");
        int c = sc.nextInt();
            int[][] arr = new int[r][c];
System.out.println("Enter The Elements");
      for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
       
        for (int i = 0; i < r; i++) {
            int max = arr[i][0];

            for (int j = 1; j < c; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            } 
            System.out.println("The Array max In each rows " + i);
 System.out.println(max); 
        }
    }
}
