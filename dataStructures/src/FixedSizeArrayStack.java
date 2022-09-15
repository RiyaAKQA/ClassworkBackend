import java.util.Arrays;

/**
 * 
 */

/**
 * @author riya.grover
 *
 */
public class FixedSizeArrayStack {

	/**
	 * @param args
	 */
	
	
	
	public static final int CAPACITY = 8; // power of 2
	
	private int capacity;
	private int[] stackArray;
	private int top = -1;
	
	
	public FixedSizeArrayStack() {
		
		// TODO Auto-generated constructor stub
		this.capacity = CAPACITY;
		stackArray = new int [capacity];
		
	}


	public FixedSizeArrayStack(int capacity) {
		// TODO Auto-generated method stub
		this.capacity = capacity;
		stackArray = new int [capacity];	

	}
	public int size() {
		return( top + 1 );
	}
	
	
	//getter for capacity
	
	public int getCapacity() {
		return CAPACITY;
	}
	public boolean isEmpty() {
		return(top<0);
	}
	// 1. Check if the stack is full 
//	If the stack is full throw exception
//	Else increment the top and push the data to the top element
//	
	public void push (int data) throws Exception {
		if(size() == capacity) throw new Exception("Stack is full");
		stackArray[++top] = data;
	}
	
	
	// retrieving the top value
   //	 
	
	public int top() throws Exception {
		if(isEmpty()) throw new Exception("Stack is Empty");
		return stackArray[top];
		
		
	}
	
	// pop is retrieving the top value and dereferencing the top from the stack
	// CHeck if the stack is empty
	// if the stack is empty throw exception 
	// Else pick the top element value of the stack as data 
	// Assign null to the top element
	// Decrement the top element
	// Return the data 
	
	public int pop() throws Exception {
		if(isEmpty()) throw new Exception("Stack is Empty");
		int data = stackArray[top];
		stackArray[top--] = Integer.MIN_VALUE; // Assign null for Objects 
		return data;
	}


	@Override
	public String toString() {
		String strStackArray = "[";
		
		if (size() > 0) strStackArray += stackArray[0];
		if(size() > 1) {
			for ( int index = 1; index <= size()-1; ++index) {
				strStackArray += "," + stackArray[index];
			}
		}
		
	return strStackArray += "]"; 
			
	}

	
}
