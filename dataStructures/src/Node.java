
public class Node {

	
		
		private Node next;
		public int data;
		
		// Create an empty node
		
		public Node() {
			next = null;
			data = Integer.MIN_VALUE; // null for objects
		}
		
		// Create a Node Storing the specified Initial Data
		
		public Node(int data) {
			next = null;
			this.data = data;
		}
		
		// Returns the node
		
		public Node getNext() {
			return next;
		}
		
		// Sets the node
		
		public void setNext(Node node) {
			next = node;
		}
		
		// Returns the data stored in the node
		
		public int getData() {
			return data;
		}
		
		// Sets the data in the node 
		
		
		public void setData(int data) {
			this.data = data;
		}
		
	

}
