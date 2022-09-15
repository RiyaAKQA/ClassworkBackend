/**
 * 
 */

/**
 * @author riya.grover
 *
 */
public class Censors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner input = new java.util.Scanner(System.in);
		java.util.List<Integer> census = new java.util.ArrayList<Integer>();
		
		
		
		
		System.out.println("Enter the age of the person , each on one line [0 to Exit] :");
		int age ;
		
		
		do {
		   age = input.nextInt();
		   if (age < 0) {
			   System.err.println("No negative age allowed ");
		   } else if (age > 0) {
			if (age == 1) infant.add(age);
			else if (age >= 2 && age <= 4) child.add(age);
			else if (age >= 5 && age <= 12) child.add(age);
			else if (age )
		   }
		} while (age != 0);
		System.out.println("Census:" + census);
		input.close();

	}

}
