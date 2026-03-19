// Write a Java program to display the number of days in a given month.
// The program should take the name or number of a month as input from the user.

// Based on the month entered, the program will determine the number of days:

// February has 28 or 29 days (depending on leap year).

// April, June, September, November have 30 days.

// All other months have 31 days.

// The program uses conditional statements (if-else or switch) to check the month and display the correct number of days.

// Input:
// April

// Output:
// 30 days

// Another Example:

// Input:
// February

// Output:
// 28/29 days

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Month: ");
        String month = sc.nextLine().toLowerCase();

        switch (month) {
            case "february":
                System.out.println("28 or 29 days");
                break;

            case "april":
            case "june":
            case "september":
            case "november":
                System.out.println("30 days");
                break;

            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                System.out.println("31 days");
                break;

            default:
                System.out.println("Invalid month");
        }

        sc.close();
    }
}
