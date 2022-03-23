import java.util.Comparator;

/**
 * 
 */

/**
 * @author ksrimang
 *
 */
public class SortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.EmployeeName.compareTo(o2.EmployeeName);
		
	}
	

}
