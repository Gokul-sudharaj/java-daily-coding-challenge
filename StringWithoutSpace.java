import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                result = result + input.charAt(i);
            }
        }

        System.out.println("Output: " + result);
    }
}
