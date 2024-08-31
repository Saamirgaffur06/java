import java.util.Scanner;

public class ninth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt(),nod=0,pw=1;
        for(;num/pw !=0;pw*=10,nod++);
        System.out.println(nod+" "+num+" "+pw);
    }
}
