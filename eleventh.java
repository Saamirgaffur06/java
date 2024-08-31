import java.util.*;
public class eleventh{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int st = -(n-1),en = n-1,r,c;
        for(r=st;r<=en;r++){
            for(c=st;c<=en;c++){
                System.out.print(Math.abs(Math.max((Math.abs(r)+1),Math.abs(c)+1)));
            }
            System.out.println();
        }
    }
}
