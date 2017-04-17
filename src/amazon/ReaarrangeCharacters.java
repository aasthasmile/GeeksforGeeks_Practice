package amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ReaarrangeCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int T = Integer.parseInt(sc.nextLine());
		for (int k = 0; k < T; k++) {
			String str = sc.nextLine();

			HashMap<Character, Integer> freq = new HashMap<>();
			for (int i = 0; i < str.length(); i++) {
				if (!freq.containsKey(str.charAt(i) )) {
					freq.put(str.charAt(i) , 0);
				}
				freq.put(str.charAt(i) , freq.get(str.charAt(i) ) + 1);
			}

			Entry<Character, Integer> maxEntry = null;
			List<String> rearrangedString = new ArrayList<String>();
			StringBuilder rs=new StringBuilder().append("");

			
			for (Entry<Character, Integer> entry : freq.entrySet()) {
				System.out.println(entry.getKey() + " | " + entry.getValue());
			}
			
			for (Entry<Character, Integer> entry : freq.entrySet()) {
				while(!freq.isEmpty()){
					rs.append(entry.getKey());
					freq.put(entry.getKey(),entry.getValue()-1);
				}
			}

			

		}
	}

}
