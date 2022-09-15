/**
 * 
 */

/**
 * @author riya.grover
 *
 */
public class Boxes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Dilip";
		Box box1 = new Box(12.0 , 15.0 , 26.0);
		Box box2 = new Box();
		
		// JVM : when you run the code , you will have :
//		1. Stack : where all your objects are stored
//		2. Heap : where all the data of objects are stored
		
//		1. It will display the stack address by default
//		2. It will override the string toString Method of the class
		System.out.println(box1 + " , Volume " + box1.volume()); // Display a heap area address
		System.out.println(box2 + " , Volume " + box2.volume()); // Display a heap area address

	}

}
