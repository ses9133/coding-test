import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
      static int N;
      static int M;
      static boolean visited[];
      static ArrayList<Integer>[] list;
      public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          N = Integer.parseInt(br.readLine());
          M = Integer.parseInt(br.readLine());
      
          list = new ArrayList[N+1];
          visited = new boolean[N+1];

          for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<Integer>();
          }
        
          for(int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            list[num1].add(num2);
            list[num2].add(num1);
          }
          
          int count = 0;

          dfs(1);

          for(int i = 2; i < N+1; i++) {
              if(visited[i]) {
                count++;
              }
          }
          System.out.println(count);
      }

      public static void dfs(int x) {
        if(visited[x]) return;
        visited[x] = true;

        for(int i : list[x]) {
          if(!visited[i]) {
              dfs(i); 
          }
        }
      }
}