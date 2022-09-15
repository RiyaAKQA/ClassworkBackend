import java.util.EmptyStackException;

/**
 * 
 */

/**
 * @author riya.grover
 *
 */
public class LinkedStackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedStack linkedStack = new LinkedStack();
		System.out.println("Initial size of the Linked Stack: " + linkedStack.size());
		System.out.println("Initial Linked Stack : " + linkedStack );
		System.out.println();
		
		linkedStack.push(12);
		linkedStack.push(22);
		linkedStack.push(32);
		System.out.println("Linked Stack is " + linkedStack.size());
		try {
			while(true) {
				System.out.println(linkedStack.pop());
			}
		} catch(EmptyStackException ese) {
			System.out.println("End of list");
		}
		

	}

}
