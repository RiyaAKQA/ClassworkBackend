package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList foodList = new ArrayList();
		foodList.add("pasta");
		foodList.add("pasta");
		foodList.add("idli");
		foodList.add("burger");
		foodList.add(false);
		foodList.add(3456);
		System.out.println(foodList.size());
		foodList.remove("pasta"); // first occuring pasta has been removed

		System.out.println(foodList);
//		foodList.clear();
//		System.out.println(foodList.size());

		System.out.println(foodList.contains("burger"));

		foodList.remove(Integer.valueOf(3456));
//		foodList.add(3, "jalebi");

		System.out.println(foodList);

		// addAll - to insert the whole collection
		
		
	}

}
