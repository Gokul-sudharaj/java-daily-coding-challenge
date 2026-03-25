/*
Problem: Check Anagram (Efficient)

Description:
Write a program to check whether two given strings are anagrams of each other.

Two strings are said to be anagrams if they contain the same characters 
with the same frequency, but possibly in a different order.

The program should return true if both strings are anagrams, 
otherwise return false.

Input:
Two strings s1 and s2

Output:
Print true if the strings are anagrams
Otherwise, print false

Input:
listen
silent

Output:
true
*/


import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String");
		String s1 = sc.nextLine().toLowerCase();
		System.out.println("Enter the Second String");
		String s2 = sc.nextLine().toLowerCase();
		
		if(isAnagram(s1,s2)){
		    System.out.println("True is Anagram");
		}
		else{
		    System.out.println("False is Not Anagram");
		}
	}
		
		public static boolean isAnagram(String s1,String s2){
		    if(s1.length() != s2.length()){
		        return false;
		    }
		    int []arr = new int[26];
		    
		    for(int i = 0;i<s1.length();i++){
		        arr[s1.charAt(i) - 'a'] ++;
		        arr[s2.charAt(i) - 'a'] --;
		    }
		    for(int i=0;i<26;i++){
		        if(arr[i]!=0){
		            return false;
		        }
		    }
		    return true;
		}
	
}
