import java.io.IOException;
import java.util.Scanner;

public class Main {
      public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
  
        while (true) {
          String word = sc.next();

          if(word.equals("0")) {
            break;
          }

        boolean isPanlidrome = true;
          for(int i = 0; i < word.length() / 2; i++) {
                int start = i;
                int end = word.length() - i - 1;
                if(word.charAt(start) != word.charAt(end)) {
                    isPanlidrome = false;
                    break;
                } 
            }
          
            if(isPanlidrome) {
              System.out.println("yes");
            } else {
              System.out.println("no");
            }
      
        }
        
        }  
    
}