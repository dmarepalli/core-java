package C_B_TreeSet;

import java.util.TreeSet;

public class T_D_Company {

	public static void main(String[] args) {
		T_C_Employee e1 = new T_C_Employee("Bob",100);
		T_C_Employee e2 = new T_C_Employee("Robert",50);
		T_C_Employee e3 = new T_C_Employee("Chang",200);
		T_C_Employee e4 = new T_C_Employee("David",150);
		T_C_Employee e5 = new T_C_Employee("Young",100);
		
		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		
		System.out.println(t);
		
		TreeSet t1 = new TreeSet(new T_E_Employee_Comparator());
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println(t1);
	}
}
