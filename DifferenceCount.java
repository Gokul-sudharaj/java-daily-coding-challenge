import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for(int i = 0; i < N; i++) {
            for(int j = i + 1; j < N; j++) {
                if(Math.abs(arr[i] - arr[j]) > 5) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
