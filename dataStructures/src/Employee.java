/**
 * 
 */

/**
 * @author riya.grover
 *
 */
public class Employee {

	/**
	 * @param args
	 */
	
	private long id ;
	private String name;
	private double salary;
	
	
	public Employee(int id, String name, int salary) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name  = name;
		this.salary = salary;
				
		
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	

}
