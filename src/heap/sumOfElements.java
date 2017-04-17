package heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class sumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());

		for (int ii = 0; ii < T; ii++) {
			int length = Integer.parseInt(sc.nextLine());
			String str = sc.nextLine().trim();
			String range = sc.nextLine().trim();

			String[] num = str.split(" ");
			String[] startEnd = range.split(" ");

			int start = Integer.parseInt(startEnd[0]);
			int end = Integer.parseInt(startEnd[1]);

			PriorityQueue<Integer> minheap = new PriorityQueue<>(length);

				
			for (int i = 0; i < num.length; i++) {
				minheap.add(Integer.parseInt(num[i].trim()));
			}

			int sum = 0;
			for (int i = 0; i < num.length; i++) {
				if (i < start)
					minheap.poll();

				if (i >= start && i < end - 1)
					sum += minheap.poll() ;

			}
			System.out.println(sum);

		}
	}

}
