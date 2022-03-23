/**
 * 
 */

/**
 * @author ksrimang
 *
 */
public class Employee implements Comparable<Employee> {
	
	
	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", Salary=" + Salary + "]";
	}


	public int EmployeeId;
	public String EmployeeName;
	public int Salary;
	
	

	public Employee(int employeeId, String employeeName, int salary) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		Salary = salary;
	}



	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		//return this.EmployeeId-o.EmployeeId;
		return Integer.compare(this.EmployeeId, o.EmployeeId);
		
		
		
	}
	

}
