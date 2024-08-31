import java.util.Scanner;

public class stack {
    static int[] a=new int[100];
    static Scanner sc=new Scanner(System.in);
    static int top=0;
    static void push(int n){
        a[top]=n;
        top++;
        System.out.println(n+" inserted successfully");
        
    }
    static void pop(){

      
        if(top==0){
            System.out.println("no elements to remove");
        }

        else{
            top--;
            System.out.println(a[top]+" removed successfully");
        }
    }
    static void display(){
        for(int i=0;i<top;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
        int ch;
        
        do{
            System.out.println("Enter the choice:\n1.push\n2.pop\n3.display");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    int n=sc.nextInt();
                    push(n);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    display();
                    break;
                default:
                    System.out.println("exiting");
            }
        }while(ch!=4);
    }
}
