
/*
Problem: Chess Board Pattern

Description:
Write a program to generate an N × N chessboard pattern using characters.

Each cell should alternate between 'B' (Black) and 'W' (White).
The top-left cell of the board must always be 'B'.

The pattern should follow a proper chessboard arrangement:
- Adjacent cells (horizontally and vertically) must have opposite colors.
- The pattern continues consistently for all rows.

Input:
An integer N representing the size of the chessboard (N x N)

Output:
Print the chessboard pattern using 'B' and 'W' with spaces between them

Example:

Input:
4

Output:
B W B W
W B W B
B W B W
W B W B
*/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Size");
		int n = sc.nextInt();
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=n;j++){
		if((i+j)% 2 !=0){
		    System.out.print(" W ");
		}
		else{
		    System.out.print(" B ");
		}

	}
	System.out.println();
	    }
	}
}
