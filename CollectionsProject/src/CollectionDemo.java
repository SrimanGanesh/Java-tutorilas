import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * 
 */

/**
 * @author ksrimang
 *
 */
public class CollectionDemo {
	public static void main(String [] args) {
		TreeSet<Employee> ts = new TreeSet<Employee>();
		Employee emp1 = new Employee(101, "Sriman", 18000);
		Employee emp2 = new Employee(104, "Ganesh", 17000);
		Employee emp3 = new Employee(103, "Shekar", 23000);
		Employee emp4 = new Employee(102, "Srilatha", 10000);
		Employee emp5 = new Employee(101, "Shannu", 40000);
		ts.add(emp1);
		ts.add(emp2);
		ts.add(emp3);
		ts.add(emp4);
		ts.add(emp5);
	//	System.out.println(ts);
		
		ArrayList<Employee> arrEmp = new ArrayList<Employee>();
		arrEmp.add(new Employee(107, "Ganesh", 56000));
		arrEmp.add(new Employee(106, "Sriman", 50000));
		Collections.sort(arrEmp);
		
		
		System.out.println(arrEmp);
		
		System.out.println("====Employee details by Name====");
		
		TreeSet<Employee> tsName = new TreeSet<Employee>(new SortByName());
		tsName.add(emp1);
		tsName.add(emp2);
		tsName.add(emp3);
		tsName.add(emp4);
		tsName.add(emp5);
		for(Employee e : tsName) {
			System.out.println(e);
			
		}
		System.out.println("====Employee details sorted by Age Assignment====");
		
		TreeSet<Person> tsPerson = new TreeSet<Person>();
		Person emp6 = new Person(101, "Ganesh", 22);
		Person emp7 = new Person(103, "Sriman", 20);
		Person emp8 = new Person(102, "Shannu", 28);
		Person emp9 = new Person(105, "Shaik", 92);
		Person emp10 = new Person(104, "Begum", 99);

		tsPerson.add(emp6);
		tsPerson.add(emp7);
		tsPerson.add(emp8);
		tsPerson.add(emp9);
		tsPerson.add(emp10);
		
		for(Person p : tsPerson) {
			System.out.println(p);
			
			
		




		
		
		
			
			
		}
		
		
		
		
		




		
		
		
		

		
		
		
		
		
		
		
		
	}
}

	
	
	


		

		

