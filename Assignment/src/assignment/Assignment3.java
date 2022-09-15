/**
 * 
 */
package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author riya.grover
 *
 */
public class Assignment3 {

	/**
	 * @param args
	 */
	
	
	public static void greaterThan3(List<String>list) {
		int c=0;
		for(String count:list) {
			if(count.length()>3) {
				c++;
			}
		}
		System.out.print(c);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		
		 List<String> names = Arrays.asList("Sam", "Peter","ballon","Sam" , "Sam" , "Peter" , "Sam" , "Sam" , "Peter");
		 
		 greaterThan3(names);
		
	        
	 
			  
		  }
		 
		
}

      


