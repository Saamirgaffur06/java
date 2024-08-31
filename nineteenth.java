import java.util.*;
public class nineteenth{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int num = s.nextInt(),fact=2,sum=1;
        int lim = (int)(Math.sqrt(num));
       for(;fact<=lim;fact++){
        if(num%fact == 0){
            sum += fact + num/fact;
        }
       }
       sum = (lim*lim == num)?sum-lim:sum;
       System.out.print(sum == num ? "perfect" : "Not perfect");
    }
}
