
/*
Problem: Remove Duplicate Characters from a String

Description:
Write a program to remove duplicate characters from a given string while maintaining the original order of characters.

Input:
programming

Output:
progamin
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println(result);
    }
}
