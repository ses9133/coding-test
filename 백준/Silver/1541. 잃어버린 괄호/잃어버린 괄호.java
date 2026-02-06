
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String example = sc.nextLine();
        String[] str = example.split("-");
        int answer = 0;
        for(int i = 0; i < str.length; i++) {
            int temp = mySum(str[i]);
            if(i == 0) {
                answer = temp;
            } else {
                answer -= temp;
            }
        }
        System.out.println(answer);
    }

    public static int mySum(String string) {
        int sum = 0;
        String[] temp = string.split("\\+");
        for(int i = 0; i < temp.length; i++) {
            sum += Integer.parseInt(temp[i]);
        }
        return sum;
    }
}