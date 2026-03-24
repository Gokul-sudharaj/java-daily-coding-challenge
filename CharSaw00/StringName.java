import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();

        char[] arr = s.toCharArray();
        char temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;

        String result = new String(arr);
        System.out.println("Result is " + result);
    }
}
