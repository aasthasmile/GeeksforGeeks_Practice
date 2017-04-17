package amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Sample Output Case:
 * Case A :
 * 1 
 * 5
 * 3 2 4 6 5
 * Case B :
  1
  61
 42 12 54 69 48 45 63 58 38 60 24 42 30 79 17 36 91 43 89 7 41 43 65 49 47 6 91 30 71 51 7 2 94 49 30 24 85 55 57 41 67 77 32 9 45 40 27 24 38 39 19 83 30 42 34 16 40 59 5 31 78 
(output : square(36) +square(77) =square(85))
 * 
 */
public class PythagoreanTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());
		for (int ii = 0; ii < T; ii++) {
			int num = Integer.parseInt(sc.nextLine());
			String str = sc.nextLine();

			String[] arr = str.split(" ");

			int[] numbers = new int[num];
			for (int i = 0; i < numbers.length; i++)
				numbers[i] = Integer.parseInt(arr[i]);

			Arrays.sort(numbers);
			//System.out.println(isTriplet(numbers, numbers.length));

			// for (int i = 0; i < numbers.length; i++) {
			// System.out.println(numbers[i]);
			// }
			int j = 0, k = 0;
			boolean flag = false;
			List<String> list = new ArrayList<>();

			for (int i = 0; i < numbers.length - 2; i++) {

				if (i == 0 || numbers[i] > numbers[i - 1]) {
					j = i + 1;
					k = numbers.length - 1;
				}

				while (j < k) {

					int a = numbers[i] * numbers[i];
					int b = numbers[j] * numbers[j];
					int c = numbers[k] * numbers[k];

					if (a + b == c || b + c == a || c + a == b) {

						// System.out.println(numbers[i] + " " + numbers[j] + "
						// = " + numbers[k]+flag);
						list.add(numbers[i] + "^2 +" + numbers[j] + "^2 = " + numbers[k] + "^2");
						flag = true;
						j++;
						k--;

						while (j < k && numbers[j] == numbers[j - 1])
							j++;
						while (j < k && numbers[k] == numbers[k + 1])
							k--;
						break;
					} else if (a + b > c)
						j++;
					else
						k--;
				}

			}

			System.out.println(flag ? "Yes" : "No");

			for (int m = 0; m < list.size(); m++) {
				System.out.print(list.get(m) + " ");
			}
		}

	}

	static boolean isTriplet(int arr[], int n) {
		// Square array elements
		for (int i = 0; i < n; i++)
			arr[i] = arr[i] * arr[i];

		// Sort array elements
		Arrays.sort(arr);

		// Now fix one element one by one and find the other two
		// elements
		for (int i = n - 1; i >= 2; i--) {
			// To find the other two elements, start two index
			// variables from two corners of the array and move
			// them toward each other
			int l = 0; // index of the first element in arr[0..i-1]
			int r = i - 1; // index of the last element in arr[0..i-1]
			while (l < r) {
				// A triplet found
				if (arr[l] + arr[r] == arr[i]){
					
				System.out.println(arr[l]+" " + arr[r]+"  ==  "+arr[i]);
					return true;
				}

				// Else either move 'l' or 'r'
				if (arr[l] + arr[r] < arr[i])
					l++;
				else
					r--;
			}
		}

		// If we reach here, then no triplet found
		return false;
	}

}
