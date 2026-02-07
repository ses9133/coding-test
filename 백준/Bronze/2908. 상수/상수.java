
import java.util.Scanner;

public class Main {
      public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        
        StringBuilder sb1 = new StringBuilder(str1);
        StringBuilder sb2 = new StringBuilder(str2);

        int num1 = Integer.parseInt(sb1.reverse().toString());
        int num2 = Integer.parseInt(sb2.reverse().toString());

        System.out.println(Math.max(num1, num2));
    }
}