import java.util.Scanner;

/**
 * 
 */

/**
 * @author riya.grover
 *
 */
public class FixedSizeArrayStackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FixedSizeArrayStack  arrStack = new FixedSizeArrayStack();
		System.out.println("Capacity of the stack = " + arrStack.getCapacity());
		System.out.println("Size of the stack = " + arrStack.size());
		System.out.println(arrStack);
		System.out.println();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Capacity ?");
		int capacity = input.nextInt();
		FixedSizeArrayStack arrStackUser = new FixedSizeArrayStack(capacity);
		for (int count = 1; count <= capacity ; ++ count) {
			
		}
		
		try {
			arrStack.push(1);
			arrStack.push(2);
		    arrStack.push(3);
			arrStack.push(4);
			arrStack.push(5);
    	    arrStack.push(6);
			arrStack.push(7);
		    arrStack.push(8);
	        arrStack.push(10);
		}
		catch(Exception e) {
			System.err.println("Error: " + e.getMessage());
			
		}
		
		System.out.println("Capacity of the stack = " + arrStack.getCapacity() );
		System.out.println("Size of the stack = " + arrStack.size());
		System.out.println(arrStack);
		try {
			System.out.println("top value  " + arrStack.top());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}
}