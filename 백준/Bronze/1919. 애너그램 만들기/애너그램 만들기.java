import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
      public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word1 = br.readLine();
        String word2 = br.readLine();

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int i = 0; i < word1.length(); i++) {
          arr1[word1.charAt(i) - 'a']++;
        }

        for(int i = 0; i < word2.length(); i++) {
          arr2[word2.charAt(i) - 'a']++;
        }
      
        int count = 0;

        for(int i = 0; i < arr1.length; i++) {
          if(arr1[i] != arr2[i]) {
            if(arr1[i] - arr2[i] < 0) {
              int diff = (arr1[i] - arr2[i]) * -1;
              count += diff;
            } else {
              count = count + (arr1[i] - arr2[i]);
            }
          }
        }

        System.out.println(count);
    } 
}
