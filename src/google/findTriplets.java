package google;

import java.util.Arrays;
import java.util.HashMap;

public class findTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {0,-1,2,-3,1};
		System.out.println("The triplets sum to zero: "+findTriplets(arr,arr.length));
		int[] sec_arr=new int[]{1 ,2,3};
		System.out.println("The triplets sum to zero: "+findTriplets(sec_arr,sec_arr.length));

		
	}

	public static boolean findTriplets(int[] arr, int n) {

		Arrays.sort(arr);
		boolean flag = false;
		for (int i = 0; i < arr.length - 2; i++) {
			if (i == 0 || arr[i] > arr[i - 1]) {
				int j = i + 1;
				int k = arr.length - 1;

				while (j < k) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						flag = true;
						j++;
						k--;
					} else if (arr[i] + arr[j] + arr[k] < 0) {
						j++;
					} else
						k--;
				}
			}
		}
		return flag;

	}
}
