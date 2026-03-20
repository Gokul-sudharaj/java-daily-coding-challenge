/*
Problem: Multiplication Table

Description:
Write a program to print the multiplication table of a given number from 1 to 10.

Input:
5

Output:
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
...
5 x 10 = 50
*/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    System.out.println("Enter The Table");
	    int n = sc.nextInt();
	    System.out.println("Enter The Steps");
	    int steps = sc.nextInt();
	    System.out.println("Multiplication Table Of" + n);
	    for(int i=1;i<=steps;i++){
	    System.out.println(n + " x " + i + " = " + (n*i));
	    }
	 
	}
}
