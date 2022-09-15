/**
 * 
 */
package assignment;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author riya.grover
 *
 */
public class Assignment2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> names = Arrays.asList("Sam", "Peter","ballon","Sam");
		 HashSet<String> hashNames = new HashSet(names);

	        //iterate through HashSet
	        for(String newNames :hashNames)
	            System.out.println(newNames);
		 
		 
		 
	}

}
