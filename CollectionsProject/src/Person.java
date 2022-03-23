/**
 * 
 */

/**
 * @author ksrimang
 *
 */
public class Person implements Comparable<Person> {
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personAge=" + personAge + "]";
	}
	public Person(int personId, String personName, int personAge) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personAge = personAge;
	}
	public int personId;
	public String personName;
	public int personAge;
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.personAge, o.personAge);
		
	}
	

}
