package codejam;

import java.util.Scanner;

public class tidyGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Testcases");
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int num = sc.nextInt();
			System.out.println("tidyNum "+isTidycheck(num));
		}
	}

	static int isTidycheck(int num) {

		int tidyNum=0;
		while(num>0) {
			if (isTidy(num)) {
				tidyNum=num;
				break;
			}
			num--;
		}

		return tidyNum ;
	}

	static boolean isTidy(int i) {
		int max = 10;
		int rem = 0;
		while (i > 0) {
			rem = i % 10;
			
			if (max < rem) 
				return false;
			
			max = rem;
			i = i / 10;
		}
		
		return true;
	}

}
