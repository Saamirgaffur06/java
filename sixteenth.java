import java.util.*;
class sixteenth{
   public static void main(String args[]){
       Scanner s = new Scanner(System.in);
       int N = s.nextInt(),l,i=0;
       int[] n = new int[N];
       for(int j=0;j<N;j++){
           n[j] = s.nextInt();
       }
      String st = s.next();
      char[] ch = st.toCharArray();
      l = st.length();
      while(l>0){
       switch(ch[i]){   
           case 'R':
               n[i] = n[i+1];
               break;
           case 'L':
               n[i] = n[i-1];
               break;
           case 'D':
               --n[i];
               break;
           case 'T':
               ++n[i];
               break;
           case 'S':
               break;

       }
       l--;
       i++;
      }
      
   }
}
