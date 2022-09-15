/**
 * 
 */
package assignment;

import java.util.Arrays;
import java.util.List;


/**
 * @author riya.grover
 *
 */
public class Assignment4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 List<String> names = Arrays.asList("Sam", "Peter","ballon","Sam" , "Sam" , "Peter" , "Sam" , "Sam" , "Peter");
        names.replaceAll(String:: toUpperCase);

		 System.out.println("UpperCase list " + names);
		   
			
				
		  
		  }

		 
		
		

	}

