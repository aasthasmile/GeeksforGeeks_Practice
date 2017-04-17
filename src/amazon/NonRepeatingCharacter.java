package amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class NonRepeatingCharacter {
	/**
	 * Given an input stream of n characters consisting only of small case
	 * alphabets the task is to find the first non repeating character each time
	 * a character is inserted to the stream.
	 * 
	 * Example Flow in stream : a, a, b, c a goes to stream : 1st non repeating
	 * element a (a) a goes to stream : no non repeating element -1 (5, 15) b
	 * goes to stream : 1st non repeating element is b (a, a, b) c goes to
	 * stream : 1st non repeating element is b (a, a, b, c)
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = Integer.parseInt(sc.nextLine());
		for (int ii = 0; ii < T; ii++) {
			int n = Integer.parseInt(sc.nextLine());
			String str = sc.nextLine().trim();

			String[] stream = str.split(" ");

			HashMap<String, Integer> map = new HashMap<String, Integer>();

			ArrayList<String> ar = new ArrayList<>();

			for (int i = 0; i < stream.length; i++) {
				String st = stream[i] + "";
				if (map.containsKey(st)) {
					map.put(st, map.get(st) + 1);
				} else {
					map.put(st, 1);
				}

				String nonRepeatingChar = followtheStream(map);

				ar.add(nonRepeatingChar);
			}

			for (int i = 0; i < ar.size(); i++) {
				System.out.print(ar.get(i) + " ");
			}
		}

	}

	private static String followtheStream(HashMap<String, Integer> map) {

		String nonRepeatingchar = null;
		for (Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			int value = (int) entry.getValue();

			if (value == 1) {
				nonRepeatingchar = key;
				break;
			} else if (value >= 2)
				nonRepeatingchar = (-1) + "";

		}
		return nonRepeatingchar;

	}

}
