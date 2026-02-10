import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
      public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double[] arr = new double[n];

        
        for(int i = 0; i < n; i++) {
          StringTokenizer st = new StringTokenizer(br.readLine());
          arr[i] = Double.parseDouble(st.nextToken());
        }
        
        double maxProduct = arr[0]; 
        double currentProduct = arr[0];

        for(int i = 1; i < arr.length; i++) {
          currentProduct = Math.max(arr[i], currentProduct * arr[i]);
          maxProduct = Math.max(currentProduct, maxProduct);
        }

        System.out.println(String.format("%.3f", maxProduct));
    } 
}
