import java.util.Scanner;

public class Main {
      public static void main(String[] args)  {
          Scanner sc = new Scanner(System.in);
          String line = sc.nextLine();
          boolean isPelindrom = true;

          for(int i = 0; i < line.length() / 2; i++) {
            int start = i;
            int end = line.length() - i - 1;
            if(line.charAt(start) != line.charAt(end)) {
              isPelindrom = false;
            }
          }

          if(isPelindrom) {
            System.out.println(1);
          } else {
            System.out.println(0);
          }
      }
}