import java.util.Scanner;

public class queue {
    static Scanner sc=new Scanner(System.in);
    static int n=sc.nextInt();
    static int[] a=new int[n+1];
    static int i=-1,j=-1;
    static void enqueue(int b){
        if(i==-1){
            i++;
            j++;
            a[i]=b;
            System.out.println(b+" Entered Successfully");
        }
        else if(i>-1&&i<n-1){
            i++;
            a[i]=b;
            System.out.println(b+" Entered Successfully");
        }
        else{
            System.out.println("Queue is full");
        }
    }
    static void dequeue(){
        
        if(j==n+1 || i<j){
            System.out.println("Queue is empty");
            i=-1;    
            j=-1;
        }
        else{
            System.out.println(a[j]+" is removed");
            j++;
            

        }
    }
    static void display(){
        if(i==-1&&j==-1){
            System.out.println("Queue is empty");
        }
        for(int k=j;k<=i;k++){
            System.out.print(a[k]+" ");
        }
        System.out.println();
    }
    public static void main(String []args){
     
        
        int choice;
        do{
            System.out.println("Enter the option\n1.Enqueue\n2.Dequeue\n3.Display");
           choice=sc.nextInt();
            switch(choice){
                case 1:
                    int a=sc.nextInt();
                    enqueue(a);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    display();
                    break;
                default:
                    System.out.println("Exiting...");
                    break;
            }

        }while(choice!=4);
    }
    
}
