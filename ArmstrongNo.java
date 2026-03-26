

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int num = sc.nextInt();
	
	if(isArmstrong(num)){
	    System.out.println(num + " is Armstrong ");
	}
	else{
	    System.out.println(num + " is Not Armstrong");
	}
	}
	
	public static boolean isArmstrong(int n){
	    int temp = n;
	    int sum =0;
	    int digit = String.valueOf(n).length();
	    
	    while(temp > 0){
	        int Lastdigit =temp % 10;
	        sum = sum +(int) Math.pow(Lastdigit,digit);
	        temp = temp / 10;
	    }
	    return sum == n;
	}
}
