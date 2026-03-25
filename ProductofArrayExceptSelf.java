/*
Problem: Product of Array Except Self

Description:
Write a program to find the product of all elements in an array except the element at each index.

For every index i, the output should contain the product of all elements of the array except nums[i].

The solution should be efficient and should not use division.

Input:
An array of integers nums

Output:
An array where each element at index i is the product of all elements except nums[i]

Input:
[1, 2, 3, 4]

Output:
[24, 12, 8, 6]
*/

import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Size");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the Elements");
        for(int i= 0;i<n;i++){
            arr[i] = sc.nextInt();
             }
        int [] result = new int[n];
        
        for(int i = 0;i<n;i++){
            int product = 1;
            for(int j = 0;j<n;j++){
                if(i != j){
                    product = product*arr[j];
                }
                
            }
            result[i]= product;
        }
        for(int val : result){
            System.out.println(val +" ");
        }
    }
}
