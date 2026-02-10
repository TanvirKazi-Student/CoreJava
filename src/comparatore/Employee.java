package comparatore;

import java.util.Objects;

public class Employee implements Comparable<Employee> { 

	String name;
	int id;
	double salary;
	int experience;
	String designation;

	public Employee() {

	}

	public Employee(String name, int id, double salary, int experience, String designation) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.experience = experience;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", experience=" + experience
				+ ", designation=" + designation + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(designation, experience, id, name, salary);
	}

	// class employee internally called the equals method of the object class
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return Objects.equals(designation, other.designation) && experience == other.experience && id == other.id
//				&& Objects.equals(name, other.name)
//				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
//	}

	@Override
	public int compareTo(Employee o) {
	
		return 0;
	}

}
