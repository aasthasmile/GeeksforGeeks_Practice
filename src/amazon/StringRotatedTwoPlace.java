package amazon;

import java.util.Scanner;

/**
 * Check if string is rotated by two places
 * 
 * http://practice.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places/0
 * 
 * Given two strings, the task is to find if a string ('a') can be obtained by
 * rotating another string ('b') by two places. Examples: Input : a = "amazon" b
 * * = "azonam" // rotated anti-clockwise Output : 1
 * 
 * Input : a = "amazon" b = "onamaz" // rotated clockwise Output : 1
 */
public class StringRotatedTwoPlace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = Integer.parseInt(sc.nextLine());
		
		for (int k = 0; k < T; k++) {
			
			String originalString = sc.nextLine();
			String rotatedString = sc.nextLine();
			
			boolean flag = false;
			
			if (originalString.length() != rotatedString.length()) {
				flag = false;
				break;
			}
			int len=originalString.length();
			
			StringBuilder str_anticlockwise=new StringBuilder().
					append(originalString).delete(0, 2).append(originalString.substring(0, 2));
			StringBuilder str_clockwise=new StringBuilder().
					append(originalString).delete(0,len-2).append(originalString.substring(0,len-2));
			
			System.out.println(str_anticlockwise);
			System.out.println(str_clockwise);
			
			if(rotatedString.equals(str_anticlockwise.toString())|| rotatedString.equals(str_clockwise.toString()))
				flag=true;
			
		System.out.println(flag?1:0);	
		}

	}

}
