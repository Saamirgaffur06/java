import java.util.*;
public class eighteenth {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=1,i;
        for( i=2;i<=n/2;i++){
            if(n%i==0){
               sum+=i;
            
        }
    }
        if(sum==n){
            System.out.println("it is perfect number");
        }
        else{
            System.out.println("it is not perfect number");
        }
    
}
}
