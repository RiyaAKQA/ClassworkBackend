/**
 * 
 */

/**
 * @author riya.grover
 *
 */
public class Tables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.print("Number?");
		int number = input.nextInt();
		
		for ( int count = 1 ; count <= 10 ; ++count) {
			System.out.printf("%5d X %5d = %10d\n" , number , count , number * count);
		}
		input.close();

	}

}
