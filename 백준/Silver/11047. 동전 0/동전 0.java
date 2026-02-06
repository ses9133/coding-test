import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer a = new StringTokenizer(br.readLine());
            A[i] = Integer.parseInt(a.nextToken());
        }

        int count = 0;

        for(int i = N-1; i >= 0; i--) {
            if(K >= A[i]) {
                int share = K / A[i];
                count += share;
                K %= A[i];
            }
            if(K == 0) break;
        }
        System.out.println(count);
    }
}
