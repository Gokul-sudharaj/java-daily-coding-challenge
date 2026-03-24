/*
Problem: Length of Last Word in a String

Description:
Write a program to find the length of the last word in a given string.
A word is defined as a sequence of characters separated by spaces.

Input:
Hello World

Output:
5
*/


import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		int length =0;
	    int i = s.length() - 1;
	  while(i>= 0 && s.charAt(i) == ' '){
	      i--;
	  }
	  while(i>=0 && s.charAt(i) != ' '){
	      length++;
	      i--;
	  }
		
		
		System.out.println("Length of the last word is : "+length);
	}
}
