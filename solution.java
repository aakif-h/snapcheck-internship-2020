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
	    if (rows != cols) {
            rows++; // make the "matrix" NxN instead of (N-1)xN
        }
		
        String res = "";
        for (int c = 0; c < cols; c++) {
            for (int r = 0; r < rows; r++) {
                if (c + r*cols < s.length()) {
                    res += s.charAt(c + r*cols);
                }
            }
            res += ' ';
        }
        return res;
	}
}