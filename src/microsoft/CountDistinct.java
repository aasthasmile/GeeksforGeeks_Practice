package microsoft;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Window Sliding Technique Given an array A[] of size n and an integer k, your
 * task is to complete the function countDistinct which prints the count of
 * distinct numbers in all windows of size k in the array A[].
 *
 */
public class CountDistinct {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = Integer.parseInt(sc.nextLine());
		for (int ii = 0; ii < T; ii++) {
			String[] nodesk = (sc.nextLine()).split(" ");

			int n = Integer.parseInt(nodesk[0]);
			int k = Integer.parseInt(nodesk[1]);
			int arr[] = new int[n];

			for (int i = 0; i < Integer.parseInt(nodesk[0]); i++) {
				arr[i] = sc.nextInt();
			}
			
			List<Integer> distinctList=new ArrayList<>();
			int count=0;
			for (int i = 0; i < n; i++) {
				
				
				if(distinctList.contains(arr[i])){
					distinctList.add(arr[i]);
				}
				else{
					count++;
					distinctList.add(arr[i]);
				}
				
				if((i+1)>=k){
					System.out.print(count+" ");
					distinctList.remove(0);
					count=distinctList.size();
				}
				
				
				
			}
			
							
			

		}

	}

}
