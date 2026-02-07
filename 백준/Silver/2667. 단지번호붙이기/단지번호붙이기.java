import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
      static boolean visited[][];
      static int arr[][];
      static int N;
      static int houseCount; 
      static int[] dx = {0, 1, 0, -1}; 
      static int[] dy = {1, 0, -1, 0};
      public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N]; 
        visited = new boolean[N][N];

        for(int i = 0; i < N; i++) {
          String line = br.readLine();
          for(int j = 0; j < N; j++) {
            arr[i][j] = line.charAt(j) - '0';
          }
        }
        
        List<Integer> totalCount = new ArrayList<>();

        for(int i = 0; i < N; i++) {
          for(int j = 0; j < N; j++) {
            if(arr[i][j] == 1 && !visited[i][j]) {
                houseCount = 0;
                dfs(i, j);
                totalCount.add(houseCount);
            }
          }
        }

        Collections.sort(totalCount);

        System.out.println(totalCount.size());

        for(int count : totalCount) {
          System.out.println(count);
        }
  }

  static void dfs(int x, int y) {
      visited[x][y] = true;
      houseCount++;

      for(int i = 0; i < 4; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];

        if(nx >= 0 && nx < N && ny >= 0 && ny < N) {
          if(arr[nx][ny] == 1 && !visited[nx][ny]) {
            dfs(nx, ny);
          }
          
        } 
      }
  }

}