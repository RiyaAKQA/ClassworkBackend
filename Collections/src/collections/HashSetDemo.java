package collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet foodSet = new HashSet();
		foodSet.add("pasta");
		foodSet.add("pizza");
		foodSet.add("burger");
		foodSet.add("pasta");
		foodSet.add("icecream");
		
		System.out.println(foodSet); // will get output in any order 
		
		// in LinkedHashSet we get the output in the same order as input

	}

}
