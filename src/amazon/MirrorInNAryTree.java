package amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

/*
 * Sample Test Case :
 * 1
 * 8 7
	1 2 2 3 3 4 3 7 3 8 4 5 5 6
	1 2 2 3 3 4 3 7 3 8 4 5 5 6
 */

public class MirrorInNAryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int T = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < T; i++) {
			String nodes = sc.nextLine().trim();
			String t1 = sc.nextLine().trim();
			String t2 = sc.nextLine().trim();

			String[] nodesEdges = nodes.split(" ");
			String[] tree1 = t1.split(" ");
			String[] tree2 = t2.split(" ");

			HashMap<String, List<String>> pairs1 = new HashMap<String, List<String>>();
			HashMap<String, List<String>> pairs2 = new HashMap<String, List<String>>();

			int len = Integer.parseInt(nodesEdges[nodesEdges.length - 1]);

			for (int j = 0; j < tree1.length; j = j + 2) {

				if (!pairs1.containsKey(tree1[j]))
					pairs1.put(tree1[j], new ArrayList<String>());

				pairs1.get(tree1[j]).add(tree1[j + 1]);
			}

			for (int k = 0; k < tree2.length; k = k + 2) {

				if (!pairs2.containsKey(tree2[k]))
					pairs2.put(tree2[k], new ArrayList<String>());

				pairs2.get(tree2[k]).add(tree2[k + 1]);

			}

			for (Entry<String, List<String>> entry : pairs1.entrySet()) {
				System.out.println(entry.getKey() + " | " + entry.getValue());
			}

			for (Entry<String, List<String>> entry : pairs2.entrySet()) {
				System.out.println(entry.getKey() + " | " + entry.getValue());

			}

			boolean flag = false;
			for (String string : pairs1.keySet()) {
				if (pairs2.containsKey(string)) {
					List<String> list1 = pairs1.get(string);
					List<String> list2 = pairs2.get(string);

					Collections.reverse(list2);

					if (!list1.equals(list2)) {
						flag = false;
						break;
					} else {
						flag = true;
					}

				}

			}
			
		System.out.println("The two tree and mirror of each other : ");	
		System.out.println(flag?1:0);	

		}

	}

}
