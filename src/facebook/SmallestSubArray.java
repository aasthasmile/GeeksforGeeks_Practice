package facebook;

import java.util.Scanner;

public class SmallestSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int T = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < T; i++) {
			int[] len = new int[2];
			for (int ii = 0; ii < 2; ii++) {
				len[ii] = sc.nextInt();
			}

			int arrlength = len[0];
			int sum = len[1];

			int arr[] = new int[arrlength];
			for (int j = 0; j < arrlength; j++) {
				arr[j] = sc.nextInt();
			}

			// Smallest Subarray of length greater than K(sum)

			int currentSum = 0;
			int start_index = 0;
			int end_index = 0;
			int min_length = arrlength + 1;

			if (len[0] == 1) {
				if (arr[0] == sum) {
					min_length = 1;
					break;
				}
			}

			

			while (end_index < arrlength) {

				while (currentSum <= sum && end_index < arrlength) {
					currentSum += arr[end_index];
					end_index++;

				}
				while (currentSum > sum && start_index < arrlength) {
					
					if (end_index - start_index < min_length)
						min_length = end_index - start_index;
					currentSum = currentSum - arr[start_index];
					start_index++;

				}
			}

			System.out.println(min_length);

		}
	}

}
