// Write a Java program to perform basic login authentication.
// The program should ask the user to enter a username and password.
// The valid credentials are predefined as:

// Username = "admin"

// Password = "1234"

// The program will compare the entered username and password with the predefined values.

// The program uses conditional statements:

// If both username and password are correct, display "Login Successful".

// Otherwise, display "Invalid Credentials".

// Input:
// admin
// 1234

// Output:
// Login Successful

// Another Example:

// Input:
// user
// 1111

// Output:
// Invalid Credentials



import java.util.*;
public class Main
{
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter user Name");
       String name = sc.nextLine();
       System.out.println("Enter your Password");
       String Password = sc.nextLine();
       
       if(name.equals("Gokul") && Password.equals("2004"))
       {
           System.out.println(" Login Successful ");
       }
       else{
           System.out.println("Invalid Credentials");
       }
	}
}
