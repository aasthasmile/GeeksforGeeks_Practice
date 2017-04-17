package amazon;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Aastha Jain
 *
 */
public class MedianInAStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of elements in stream :");
		int num = Integer.parseInt(sc.nextLine());

		int stream[] = new int[num];
		int effectiveMedian = 0;

		PriorityQueue<Integer> minheap = new PriorityQueue<>(num);
		PriorityQueue<Integer> maxheap = new PriorityQueue<>(num, Collections.reverseOrder());

		for (int i = 0; i < num; i++) {
			System.out.println("Enter the "+(i+1)+" element: ");
			stream[i] = sc.nextInt();

			if (stream[i] > effectiveMedian)
				minheap.add(stream[i]);
			else
				maxheap.add(stream[i]);

			if (minheap.size() > maxheap.size() + 1)
				maxheap.add(minheap.poll());

			else if (minheap.size() < maxheap.size() + 1)
				minheap.add(maxheap.poll());

			if (minheap.size() == maxheap.size())
				effectiveMedian = (minheap.peek() + maxheap.peek()) / 2;
			else if (minheap.size() > maxheap.size())
				effectiveMedian = minheap.peek();
			else
				effectiveMedian = maxheap.peek();

			System.out.println(effectiveMedian);

		}
	}

}
