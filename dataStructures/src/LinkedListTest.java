import java.util.LinkedList;

/**
 * 
 */

/**
 * @author riya.grover
 *
 */
public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Employee> employees = new LinkedList<Employee>();
		System.out.println("Initial size of Linked List: " + employees.size());
		
		employees.add(new Employee(1 , "Dilip" , 10000));
		employees.add(new Employee(2 , "Kiran" , 100500));
		employees.add(new Employee(3 , "Raj" , 1000560));
		employees.add(new Employee(4 , "Parul" , 1000530));
		employees.add(new Employee(5 , "Deepak" , 1004500));
		employees.add(new Employee(6 , "Dilipa" , 1007600));
		employees.add(new Employee(7 , "Di" , 1004300));
		
		System.out.println("Size of the Linked List after add :" + employees.size());
		for ( Employee employee : employees) {
			System.out.println(employee);
		}

	}

}
