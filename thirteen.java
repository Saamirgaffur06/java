import java.util.*;
public class thirteen{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String name=sc.next();
        String rotate=sc.next();
        if(rotate.length()==name.length()){
            name=name+name;
        
            System.out.print((name.contains(rotate)?"yes":"no"));
        }
        else{
            System.out.println("no");
        }
    }
}