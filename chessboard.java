import java.util.*;

public class chessboard {
    /**
     * @param args
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0, temp = 0,m=0;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1) {
                    flag = 1;

                }

            }
            if (flag == 0) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        if (a[k][j] == 1) {
                            temp=1;
                            m=k;
                            break;
                        } 
                    }
                    if(temp==0){
                        a[i][j]=1;
                        break;
                    }
                    temp = 0;
                    m=0;

                    
                    }
                }
                flag = 0;
            }
            
        
        System.out.println();
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
