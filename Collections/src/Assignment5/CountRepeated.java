package Assignment5;

import java.util.HashMap;
import java.util.Map;

public class CountRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Riya Grover";
		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();

		char[] strArray = name.toCharArray();
		for (char ch : strArray) {
			if (countMap.containsKey(ch)) {

				countMap.put(ch, countMap.get(ch) + 1);
			} else {

				countMap.put(ch, 1);
			}
		}
		for (Map.Entry entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

	}
}
