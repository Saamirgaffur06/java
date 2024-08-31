import java.util.Scanner;
public class fifteenth
{
              public static void main(String[] args) {
                  Scanner sc=new Scanner(System.in);
                  String s=sc.nextLine();
                  char [] arr=s.toCharArray();
                  for(int i=0;i<arr.length;i++)
                  {
                      arr[i]=(i%2!=0)?(char)(arr[i]+12):(char)(arr[i]-1);
                      
                  }
                           for(int i=arr.length-1;i>=0;i--)
                               System.out.print(arr[i]);
              }
}
