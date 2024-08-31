import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
    
        switch (c) {
            case 1:
                for(char ch='A';ch<='Z';System.out.print(ch),ch++);
                break;
            case 2:
                for(char ch='a';ch<='z';System.out.print(ch),ch++);
                break;
            case 3:
                for(char ch='A';ch<='Z';System.out.printf((ch+""+(char)(ch+32)),ch++));
                break;
            case 4:
                for(char ch='a';ch<='Z';System.out.printf((ch+""+(char)(ch-32)),ch++));
                break;
            case 5:
                 for(char ch='A';ch<='Z';System.out.printf((ch+""+(char)(ch+33)),ch+=2));
                 break; 
            case 6:
                for(char ch='a';ch<='z';System.out.printf((ch+""+(char)(ch-31)),ch+=2));
                break;    
            default:
                break;
        }
    }
}
