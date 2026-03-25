/*
Problem: Two Sum (Optimized)

Description:
Write a program to find the indices of two numbers in an array such that they add up to a given target value.

Each input will have exactly one solution, and the same element cannot be used twice.

The solution should be optimized for efficiency.

Input:
An array of integers nums and an integer target

Output:
Print the indices of the two numbers such that they add up to the target

Input:
nums = [2, 7, 11, 15], target = 9

Output:
[0, 1]
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
        System.out.println("Enter the target value");
        int target = sc.nextInt();
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
            if(arr[i] + arr[j] == target ){
                System.out.println("[" + i + ","+j +"]");
            }
        }
    }
}
