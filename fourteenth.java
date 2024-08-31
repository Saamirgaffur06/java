import java.util.*;
public class fourteenth {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String msg=sc.next();
        char[] ch=msg.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]%2==0){
                ch[i]=(char)(((ch[i]*5+2)*5)+2);
            }
            else{ 
                ch[i]=(char)(((ch[i]+30)*2)+5);

            }
        }
        String next=String.copyValueOf(ch);
        System.out.println(next);

    }
    
}
