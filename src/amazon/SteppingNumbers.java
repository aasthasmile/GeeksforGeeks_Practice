package amazon;

import java.util.ArrayList;
import java.util.Scanner;

public class SteppingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		for (int ii = 0; ii < T; ii++) {
			int[] arr = new int[2];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}

			int count = 0;
			for (int j = arr[0]; j <= arr[1]; j++) {
				 if (isCheck(j)) {
				 System.out.print(j+" ");
				 count++;
				 }
			}
			System.out.println(count);
		}

		

	}

	private static boolean isCheck(int num) {

		if (num >= 0 && num <= 10)
			return true;

		int rem = 0, i = 0;
	
		ArrayList<Integer> ar = new ArrayList<>();
		while (num != 0) {
			rem = num % 10;
			ar.add(i, rem);
			num = num / 10;
			i++;
		}

		boolean flag = false;
		for (int j = 0; j < ar.size() - 1; j++) {
			
			if (Math.abs(ar.get(j) - ar.get(j + 1)) != 1) {
				flag = false;
				break;
			}
			flag = true;
		}
		return flag;

	}

}