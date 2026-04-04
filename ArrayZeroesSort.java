import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
     int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                if (i != index) {
                    arr[i] = arr[i] + arr[index];
                    arr[index] = arr[i] - arr[index];
                    arr[i] = arr[i] - arr[index];
                }
                index++;
            }
        }
        for (int i = 0; i < index - 1; i++) {
            for (int j = 0; j < index - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
