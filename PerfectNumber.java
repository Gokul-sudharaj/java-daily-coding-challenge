import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<n;i++){
            if(n%i==0){
                sum = sum+i;
            }
        }
        if(sum == n){
            System.out.println("The Given Number is PerfectNumber");
        }
        else{
            System.out.println("The Given Number is Not PerfectNumber");
        }
    }
}
