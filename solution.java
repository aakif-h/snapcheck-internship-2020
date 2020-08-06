import java.util.*;
import java.lang.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Type in the string to be encrypted: ");
	    String input = sc.nextLine();
	    System.out.println("The encrypted string is: " + encryptedString(input));
	}
	
	public static String encryptedString(String s) {
	    s = s.replaceAll("\\s+",""); // get rid of all whitespaces with regex
	    
	    double sqrt = Math.sqrt(s.length());
	    int rows = (int)(Math.floor(sqrt));
	    int cols = (int)(Math.ceil(sqrt));
	    
	    char[][] matrix = new char[rows][cols];
	    int k = 0;
	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < cols; j++) {
	            if (k >= s.length()) {
	                break;
	            }
	            matrix[i][j] = s.charAt(k++);
	        }
	    }

	    String res = "";
	    for (int c = 0; c < cols; c++) {
	        for (int r = 0; r < rows; r++) {
	            if (matrix[r][c] == '\0') {
	                break;
	            }
	            res += matrix[r][c];
	        }
	        res += ' ';
	    }
	    
	    return res;
	}
}