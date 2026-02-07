import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] alphabet = new int[26];
		String str = scanner.next().toUpperCase();
	    
	    
	    int max = 0;
	    char ch = '?';
	    
	    for(int i = 0; i < str.length(); i++) {
	    	
	    	int tempNum = str.charAt(i) - 65;
	    	
	    	alphabet[tempNum] ++;
	    }
	    
	    
	    for(int i = 0; i < alphabet.length; i++) {
	    	
	    	if(alphabet[i] > max) {
	    		max = alphabet[i];
	    		ch = (char)(i+65);
	    	} else if(alphabet[i] == max) {
	    		ch = '?';
	    	}
	    	
	    }
	     
	    
	    System.out.println(ch);
		
	}	
		
		
	}


