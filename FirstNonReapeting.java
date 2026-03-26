import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size");
        int n = sc.nextInt();
        int []arr = new int[n];
        
        System.out.println("Enter the element");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int found =0;
        
        for(int i=0;i<n;i++){
            int count =0;
            for(int j=0;j<n;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            
            if(count == 1){
                System.out.println("The First Non Repeating Number : " + arr[i]);
                found =1;
                break;
            }
        }
        if(found == 0){
            System.out.println("They are No Non Repeating Number");
        }
    }
}
