import java.util.*;
public class fifth {
    public static void main(String[] args) {
        int n,n1,n2,n3,option;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        option=sc.nextInt();
        switch (option) {
            case 1: 
                    System.out.print(0+" "+1);
                    for(n1=0,n2=1;(n--)>=0;n3=n1+n2,System.out.print(" "+n3),n1=n2,n2=n3);
                    break;
            case 2: 
                    int k=1;
                    for(int i=1;i<n;i++){
                        for(int j=1;j<=i;j++){
                            System.out.print(k+" ");
                            k+=2;
                        }
                           
                       System.out.println(" ");
                   }
            default:
                break;
        }
    }
}
