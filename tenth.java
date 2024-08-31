import java.util.*;
public class tenth{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int st = -(n-1),en = n-1,r,c;
        for(r=st;r<=en;r++){
            for(c=st;c<=en;c++){
                System.out.print(Math.abs(Math.max((Math.abs(r)-n),Math.abs(c)-n)));
            }
            System.out.println();
        }
    }
}
