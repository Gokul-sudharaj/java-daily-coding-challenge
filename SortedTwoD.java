import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Row");
		int r = sc.nextInt();
		System.out.println("Enter the Column");
		int c = sc.nextInt();
		
		int [][]matrix = new int[r][c]; // 2d
		int []arr = new int [r*c]; // 1d
		
		System.out.println("Enter the elements");
		int k = 0;
		for(int i = 0;i<r;i++){
		    for(int j =0;j<c;j++){
		        matrix[i][j] = sc.nextInt();
		        arr[k++] = matrix[i][j];//matrix to arr
		         
		    }
		}
		//Sorting the arrray
		for(int i=0;i<arr.length-1;i++){
		    for(int j=0;j<arr.length - i - 1;j++){
		        if(arr[j] > arr[j+ 1]){
		            int temp = arr[j];//swapping
		            arr[j] = arr[j+ 1];
		            arr[j + 1] = temp;
		        } 
		    }
		}
		// arr to matrix
		k= 0;
		for(int i=0;i<c;i++){
		    for(int j = 0;j<r;j++){
		        matrix[i][j] = arr[k++];
		    }
		}
		
		//println
		System.out.println("Sorted 2d array ");
		for(int i=0;i<c;i++){
		    for(int j=0;j<r;j++){
		        System.out.print(matrix[i][j] + " ");
		    }
		   System.out.println();
		}
		
	}
}
