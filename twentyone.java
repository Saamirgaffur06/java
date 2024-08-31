import java.util.*;

public class twentyone {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong(), m, max = 0, o = 0;

        while (n > 0) {
            m = n % 10;
            if (m > max) {
                max = m;
            }
            n = n / 10;
        }
        System.out.print(max);
    }     
}
