import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        long num = sc.nextInt();
        
        int arr[] = new int[10];
        
        while (num >0){
            int digit = (int) num%10;
            arr[digit]++;
            num = num/10;
        }
        System.out.println("The Freaquency of Digits");
        for(int i =0;i<10;i++){
            if(arr[i]>0){
            System.out.println(i + " --> " +arr[i]);
            }
        }
    }
}
