import java.util.*;

public class twentyfour {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), count = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i == 0 && arr[i] < arr[i + 1]) {
                count++;
            } else if (i == n - 1 && arr[i] < arr[i - 1]) {
                count++;
            } else if (i > 0 && i < n - 1 && arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
