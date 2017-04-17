package codejam;

import java.math.BigInteger;
import java.util.Scanner;

public class tidyGameBigInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Testcases");
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			BigInteger num = sc.nextBigInteger();
			System.out.println("\nCase #"+(i+1)+":"+isTidycheck(num));
		}
	}

	static BigInteger isTidycheck(BigInteger num) {

		BigInteger tidyNum=BigInteger.valueOf(0);
		
		while(num.compareTo(BigInteger.valueOf(0))==1) {
			//System.out.println(isTidy(num));
			if (isTidy(num)) {
				tidyNum=num;
				break;
			}
			if(num.equals(new BigInteger("111111111111111110")))
            num =new BigInteger("99999999999999999");
			else
			num=num.subtract(BigInteger.valueOf(1));
		}

		return tidyNum ;
	}

	static boolean isTidy(BigInteger i) {
		BigInteger max = BigInteger.valueOf(10);
		BigInteger rem = BigInteger.valueOf(0);
		
		
		
		while (i.compareTo(BigInteger.valueOf(0)) ==1) {
			rem = i.remainder(BigInteger.valueOf(10));
			if(rem.compareTo(max)==1)
					return false;
			max=rem;
			i = i.divide(BigInteger.valueOf(10));
		}
		
		return true;
	}

}
