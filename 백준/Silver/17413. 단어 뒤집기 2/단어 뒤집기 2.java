import java.util.Scanner;
import java.util.Stack;

public class Main {
      public static void main(String[] args)  {
          Scanner sc = new Scanner(System.in);
          String line = sc.nextLine();
          Stack<Character> stack = new Stack<>();
          StringBuilder sb = new StringBuilder();
          boolean inTag = false;

          for(int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if(c == '<') {
              inTag = true;
              while (!stack.isEmpty()) {
                sb.append(stack.pop());
              }
              sb.append(c);
            } else if(c == '>') {
              inTag = false;
              sb.append(c);
            } else if(inTag) {
              sb.append(c);
            } else if(c == ' ') {
              while(!stack.isEmpty()) {
                sb.append(stack.pop());
              }
              sb.append(c);
            } else {
              stack.push(c);
            }
      }

      while(!stack.isEmpty()) {
            sb.append(stack.pop());
          }

      System.out.println(sb.toString());  
      }
}