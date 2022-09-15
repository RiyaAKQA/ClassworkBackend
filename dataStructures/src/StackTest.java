import java.util.Stack;

/**
 * 
 */

/**
 * @author riya.grover
 *
 */
public class StackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Employee> employees = new Stack<Employee>();
		System.out.println("Initial capacity of stack: " + employees.capacity());
		System.out.println("Initial size of stack: " + employees.size());
		System.out.println("Initial Data in the stack: " + employees);
		
		employees.push(new Employee(12, "Dilip" , 400000));
		employees.push(new Employee(26, "Ashok" , 40000));
		employees.push(new Employee(14, "Dilipa" , 4000800));
		employees.push(new Employee(33, "Mahesh" , 400560));
		employees.push(new Employee(67, "Deepak" , 4000004));
		employees.push(new Employee(18, "ip" , 40000670));
		
		
		System.out.println("AFter push Capacity="+employees.capacity());
		System.out.println("AFter push size="+employees.size());
		System.out.println("AFter push data="+employees);
		

	}

}
