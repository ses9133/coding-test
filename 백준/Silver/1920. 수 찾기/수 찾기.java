import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        Arrays.sort(A);

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++) {
            boolean found = false;
            int target = Integer.parseInt(st2.nextToken());
            int start = 0;
            int end = N - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if(A[mid] < target) {
                    start = mid + 1;
                } else if (A[mid] > target) {
                    end = mid - 1;
                } else {
                    found = true;
                    break;
                }
            }
            if(found) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
