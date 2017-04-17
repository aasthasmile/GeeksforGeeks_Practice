package amazon;

import java.util.Scanner;

/**
 * Given a string s, the task is to count number of subsequences of the form
 * aibjck, where i >= 1, j >=1 and k >= 1. Note: Two subsequences are considered
 * different if the set of array indexes picked for the 2 subsequences are
 * different. link :
 * http://www.geeksforgeeks.org/number-subsequences-form-ai-bj-ck/ Examples:
 * Input : abbc Output : 3 Subsequences are abc, abc and abbc
 * 
 * Input : abcabc Output : 7 Subsequences are abc, abc, abbc, aabc abcc, abc and
 * abc
 * 
 * @author Aastha Jain
 *
 */
public class CountSubsequences {
	/**
	* Approach :
	* Traverse all characters of given string. Do following for current character s[i]
    If current character is ‘a’, then there are following possibilities :
    a) Current character begins a new subsequence.
    b) Current character is part of aCount subsequences.
    c) Current character is not part of aCount subsequences.
    Therefore we do aCount = (1 + 2 * aCount);
    If current character is ‘b’, then there are following possibilities :
    a) Current character begins a new subsequence of b’s with aCount subsequences.
    b) Current character is part of bCount subsequences.
    c) Current character is not part of bCount subsequences.
    Therefore we do bCount = (aCount + 2 * bCount);
    If current character is ‘c’, then there are following possibilities :
    a) Current character begins a new subsequence of c’s with bCount subsequences.
    b) Current character is part of cCount subsequences.
    c) Current character is not part of cCount subsequences.
    Therefore we do cCount = (bCount + 2 * cCount);
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		for (int ii = 0; ii < T; ii++) {
			String str = sc.nextLine();

			int acount = 0, bcount = 0, ccount = 0;
			for (int i = 0; i < str.length(); i++) {
				
				if (str.charAt(i) == 'a')
					acount = 1 + 2 * acount;
				else if (str.charAt(i) == 'b')
					bcount = acount + 2 * bcount;
				else if (str.charAt(i) == 'c')
					ccount = bcount + 2 * ccount;
	
			}

			System.out.println(ccount);
		}
	}

}
