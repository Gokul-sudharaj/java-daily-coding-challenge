
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String");
		String s1 = sc.nextLine().toLowerCase();
		System.out.println("Enter the Second String");
		String s2 = sc.nextLine().toLowerCase();
		
		if(isAnagram(s1,s2)){
		    System.out.println("True is Anagram");
		}
		else{
		    System.out.println("False is Not Anagram");
		}
	}
		
		public static boolean isAnagram(String s1,String s2){
		    if(s1.length() != s2.length()){
		        return false;
		    }
		    int []arr = new int[26];
		    
		    for(int i = 0;i<s1.length();i++){
		        arr[s1.charAt(i) - 'a'] ++;
		        arr[s2.charAt(i) - 'a'] --;
		    }
		    for(int i=0;i<26;i++){
		        if(arr[i]!=0){
		            return false;
		        }
		    }
		    return true;
		}
	
}
