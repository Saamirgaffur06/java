import java.util.*;
import java.io.*;
public class fourth {
    public static void main(String[] args) {
        int a,b,option;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        option=sc.nextInt();
        switch (option) {
            case 1:
                for(int i=a;i<=b;System.out.printf(i+" "),i+=a);
                break;
            case 2:
            for(int i=a;i<=b;System.out.printf(i+" "),i*=a);
            break;
            default:
                break;
        }

    }
}
