import java.util.*;
public class seventh {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int lin=(int)Math.sqrt(num);
        lin=(lin*lin==num)?lin-1:lin;
        for(int fact=1;fact<=lin;fact++){
            if(num%fact==0){
                System.out.print(fact+" "+num/fact+" ");
            }
        }
        if((lin-1)*(lin+1)==num)
            System.out.print(lin+1);
    }
    
}
