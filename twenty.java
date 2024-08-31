import java.util.*;
public class twenty {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of frogs:");
        int n=sc.nextInt();
        
        System.out.println("Enter the number of insects:");
        int m=sc.nextInt();
        int[] l=new int[n];
        int[] w=new int[m];
        int[] v=new int[m];
        int[] x=new int[n];
        int[] y=new int[n];
        for(int i=0;i<n;System.out.println("Enter the x cordinate(frogs):"),x[i]=sc.nextInt(),System.out.println("Enter the y cordinate(frogs):"), y[i]=sc.nextInt(),System.out.println("Enter the trunk length:"),l[i]=sc.nextInt(),i++);
        for(int j=0;j<m;System.out.println("Enter the x cordinate(insects):"),w[j]=sc.nextInt(),System.out.println("Enter the y cordinate(insects):"),v[j]=sc.nextInt(),j++);
       
        for(int k=0;k<n;k++){
            for(int o=0;o<m;o++){
                int d=(int) Math.sqrt((w[o]-x[k])+(v[o]-y[k]));
                System.out.println(d);
                if(d<=l[k]){
                    System.out.println("frog "+(k+1)+" can eat "+(o+1));
                }
            }
        }

    }
}
