/*
Problem: Sorting an Array in Ascending Order

Description:
Write a program to sort the elements of an array in ascending order.

Input:
5
5 2 8 1 3

Output:
1 2 3 5 8
*/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    System.out.println("Enter the array size");
	    int n = sc.nextInt();
	    int []arr = new int[n];
	    System.out.println("Enter the Elements");
	    for(int i = 0; i<n;i++){
	         arr[i] = sc.nextInt();
	    }
	    int temp=0;
	    for(int i = 0;i<n-1;i++){
	        for(int j =i+1;j<n;j++){
	            if(arr[i] > arr[j]){
	                temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	           
	        }
	    }
	    System.out.println("Sorted array");
	  for(int  i = 0;i<n;i++){
	      System.out.print(arr[i] + " ");
	  }
	}
}
