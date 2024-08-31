import java.util.*;
public class twentytwo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int sum1=0;
        int sum2=0;
        int n2=sc.nextInt();
        for(int i=1;i<=n1/2;i++){
            if(n1%i==0){
                sum1=sum1+i;
            }
        }
        for(int j=1;j<=n2/2;j++){
            if(n2%j==0){
                sum2=sum2+j;
            }
        }
        System.out.println((sum1==n2)&&(sum2==n1)?"amicable":"not amicable");
    }
}
