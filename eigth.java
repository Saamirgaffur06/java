import java.util.Scanner;

public class eigth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);       
        int i,num= sc.nextInt(),lin=(int)Math.sqrt(num);
        if(num%2==0 && num!=2){
            System.out.println("No");
        }
        else{
            
            for(i=3;i<num && num%i!=0 && num%2!=0;i+=2);
            System.out.println(i==num||num==2?"yes":"No");
        }
    }    
}
