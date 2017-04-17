package amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

final class Heap implements Comparable<Heap> {
	int[] array;
	int index;

	public Heap(int[] arr, int index) {

		this.array = arr;
		this.index = index;
	}

	@Override
	public int compareTo(Heap h) {
		return this.array[this.index] - h.array[h.index];
	}
}

public class MergeKSortedArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.nextLine());

		for (int ii = 0; ii < T; ii++) {
			int k = Integer.parseInt(sc.nextLine());
			String[] matrix = sc.nextLine().split(" ");

			int rows = matrix.length / k;

			int[][] sortedArray = new int[rows][k];
			int position = 0;
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < k; j++) {
					sortedArray[i][j] = Integer.parseInt(matrix[position++]);
					System.out.print(sortedArray[i][j] + " ");
				}
				System.out.println();
			}
			mergeKArrays(sortedArray, k);
		}
	}

	public static ArrayList<Integer> mergeKArrays(int[][] arrays, int k) {

		PriorityQueue<Heap> heapSort = new PriorityQueue<Heap>(k);
		List<Integer> list = new ArrayList<>(arrays.length * k);

		// traversing the columns and adding the first element of each row.
		for (int i = 0; i < arrays.length; i++) {
			heapSort.add(new Heap(arrays[i], 0));
		}

		while (!heapSort.isEmpty()) {
			Heap top = heapSort.poll();
			list.add(top.array[top.index]);
			if (top.index < top.array.length - 1) {
				top.index++;
				heapSort.add(top);
			}
		}

		for (int i : list) {
			System.out.print(i + " ");
		}
		return (ArrayList<Integer>) list;
	}
}

