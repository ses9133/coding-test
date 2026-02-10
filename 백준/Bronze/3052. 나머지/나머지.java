
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
      public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < 10; i++) {
          int num = sc.nextInt();

          int rest = num % 42;
          set.add(rest);
        }
        System.out.println(set.size());
    } 
}
