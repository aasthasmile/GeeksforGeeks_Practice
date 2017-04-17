package amazon;

import java.util.Scanner;

public class firstSetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			int rem = 0, position = 0;
			String binary = "";
			
			int pos=0;
			while (n > 0) {
				position++;
				rem = n % 2;
				if (rem == 1) {
					pos=position;
					break;
				}
				binary += String.valueOf(rem);
				n = n / 2;
			}
			System.out.println(pos);
		}
	}
}
