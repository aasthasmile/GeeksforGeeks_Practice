package amazon;

import java.util.Scanner;
import java.util.Stack;
/**
 * Given a string S of brackets, the task is to find an index k which decides the 
 * number of opening brackets is equal to the number of closing brackets.
String must be consists of only opening and closing brackets i.e. ‘(‘ and ‘)’.
Example:
Input:
2
(())))(
))
Output:
4
2
 * @author Aastha Jain
 *
 */
public class EqualPointInAStringOfBrackets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		for (int ii = 0; ii < T; ii++) {
			String str = sc.nextLine();

			int[] openingBracket = new int[str.length()];
			int[] closingBracket = new int[str.length()];

			int openCount = 0, closeCount = 0, position = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '(') 
					openCount++;
				
				openingBracket[i]=openCount;
			}
			for (int i = str.length()-1; i >=0; i--) {
				 if (str.charAt(i) == ')') 
					closeCount++;
					 closingBracket[i]=closeCount;

			}
			for (int i = 0; i < str.length(); i++) {
				if(openingBracket[i]==closingBracket[i]){
					position=i;
				     break;
				}
				position=-1;
			}	
					
		/**
			 * Boundary Case : When there is either all the opening or
			 * either all the closing brackets
			 */
			if(openingBracket[str.length()-1]==0) //all closing brackets
				position=str.length();
			else if(closingBracket[0]==0) //all opening brackets
				position=0;
			System.out.println(position);
		}
	}

}
