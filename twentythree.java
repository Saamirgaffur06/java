import java.util.Scanner;

public class twentythree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length, n, ans = 0;
        n = sc.nextInt();
        length = (int) Math.log10(n) + 1;
        int power = (int) Math.pow(10, length - 1);
        int rotate = sc.nextInt();
        while (rotate > 0) {
            ans = (n % 10) * power;
            n /= 10;
            ans = ans + n;
            n = ans;
            rotate--;
        }
        System.out.println(ans);

    }
}
