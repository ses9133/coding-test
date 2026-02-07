
import java.util.Scanner;

public class Main {
      public static void main(String[] args)  {

        int[][] arr = new int[15][16];
        for(int i = 0; i < 15; i++) {
          for(int j = 1; j < 15; j++) {
            if(i == 0) {
              arr[i][j] = j;
            } else {
              arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
          }
        }

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++) {
          int n = sc.nextInt(); 
          int k = sc.nextInt(); 

          System.out.println(arr[n][k]);
        }

      }  
    
}