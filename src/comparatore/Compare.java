package comparatore;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
//import java.util.Comparator;
import java.util.TreeSet;

public class Compare {

	public static void main(String[] args) {

//		@Override
//		public int compare(Employee o1, Employee o2) {
//			if (o1.id > o2.id) {
//				return 1;
//			} else if (o1.id < o2.id) {
//				return -1;
//			}
//			return 0;
//		}
//	};

//	Comparator<Employee> c2 = new Comparator<Employee>() {
//
//		@Override
//		public int compare(Employee o1, Employee o2) {
//
//			return o1.name.compareTo(o2.name);
//		}
//	};

//		comparator is use hidic so we use comparatorTo
		Comparator<Employee> c = (o1, o2) -> o1.id > o2.id ? 1 : o1.id < o2.id ? -1 : 0;
		Comparator<Employee> c2 = (o1, o2) -> o1.name.compareTo(o2.name);
		Comparator<Employee> c3 = (o1, o2) -> o1.salary > o2.salary ? 1 : o1.salary < o2.salary ? -1 : 0;

		TreeSet<Employee> db = new TreeSet<Employee>(c);
		db.add(new Employee("Mahesh", 5444, 35099.0, 3, "Software Developer"));
		db.add(new Employee("Ramesh", 5443, 35088.0, 4, "Software Tester"));
		db.add(new Employee("Raju", 5434, 35087.0, 1, "Software Developer"));
		db.add(new Employee("Rani", 5433, 35078.0, 5, "Data Scienticst"));
		db.add(new Employee("Rasmi", 5432, 35090.0, 4, "HR"));
		db.add(new Employee("Rasmi", 5432, 35090.0, 4, "HR"));
//		db.add(null);
//		System.out.println(db);
//
//		for (Employee employee : db) {
//			System.out.println(employee);
//		}

		HashSet<Employee> h1 = new HashSet<>(db);// hash set allows duplicate but we pass the refrance of treeset into
													// hashset so thats way they not allow duplicate

		for (Employee employee : h1) {
			System.out.println(employee);
		}

//		System.out.println(db);

//		System.out.println(collection.max(db));

	}
}
