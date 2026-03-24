/*
Problem: Occurrence of Character in a String

Description:
Write a program to count how many times a given character appears in a string.

Input:
hello
l

Output:
2
*/


import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
	
		System.out.println("Enter the Character");
		char ch = sc.next().charAt(0);
	    int count =0;
		for(int i=0;i< s.length();i++){
		    if(s.charAt(i) == ch){
		        count++;
		    }
		}
		System.out.println("the no of "+ch+  " is = "+count);
	}
}
