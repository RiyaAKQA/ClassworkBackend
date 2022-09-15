import java.util.EmptyStackException;

public class LinkedStack {
    private int length; // Size of the linked list
    private Node top;
    
    public LinkedStack() { // Creates an Empty Linked list Stack
    	length = 0;
    	top = null;
    }
     public void push (int data) { // push the data to the linked list stack
    	 
    	 Node temp = new Node(data);
    	 temp.setNext(top);
    	 top = temp;
    	 ++length;
    	 
     }
     
     public int pop() throws EmptyStackException {
    	 if(isEmpty()) throw new EmptyStackException();
    	 int data = top.getData();
    	 top = top.getNext();
    	 --length;
    	 return data;

     }
     
     public boolean isEmpty() { // returns false if the size is zero
    	 return (length == 0 );
     }
     
     public int size() { // returns the size of the Linked list stack
		return length;
    	 
     }
	@Override
	public String toString() {
		String strLinkedList = "";
		
		Node current = top;
		while(current != null) {
			strLinkedList += current + "\n";
			current = current.getNext();
			
		}
		return strLinkedList;
	}
    
  
}
