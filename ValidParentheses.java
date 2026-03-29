/*
Problem: Valid Parentheses

Description:
Given a string s containing only bracket characters:
'(', ')', '{', '}', '[', ']',
write a program to determine whether the string is valid.

A string is considered valid if:
- Every opening bracket has a corresponding closing bracket of the same type.
- Brackets are closed in the correct order.
- Every closing bracket matches the most recent unmatched opening bracket.

Input:
A string s consisting only of characters: ()[]{}

Output:
Return true if the string is valid, otherwise return false.

Example:

Input:
"()[]{}"

Output:
true

Invalid Example:

Input:
"(]"

Output:
false

Constraints:
1 ≤ length of string ≤ 10^4
*/

import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        System.out.println(isValid(s));
    }
        public static boolean isValid(String s){
            while(s.contains("{}") || s.contains("[]") || s.contains("()")){
                s=s.replace("{}","").replace("[]","").replace("()","");
                
            }
           return s.isEmpty();
        }

}
