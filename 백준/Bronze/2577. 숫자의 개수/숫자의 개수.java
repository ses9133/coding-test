import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
      public static void main(String[] args)  {
          Scanner sc = new Scanner(System.in);
          int num1 = sc.nextInt();
          int num2 = sc.nextInt();
          int num3 = sc.nextInt();

          int product = num1 * num2 * num3;

          String str = String.valueOf(product);
          int countZero = 0;
          Map<Character, Integer> map = new HashMap<>();

          for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '0') {
              countZero++;
            }

            if(map.containsKey(c)) {
              map.put(c, map.get(c) + 1);
            } else {
              map.put(c, 1);
            }
          }

          int[] arr = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

          for(char c : map.keySet()) {
            int i = Integer.parseInt(String.valueOf(c));
            arr[i] = map.get(c);
          }

          System.out.println(countZero);

          for(int i = 1; i < arr.length; i++) {
            System.out.println(arr[i]);
          }
      }
}