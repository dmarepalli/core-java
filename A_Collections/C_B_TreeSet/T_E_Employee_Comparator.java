package C_B_TreeSet;

import java.util.Comparator;

public class T_E_Employee_Comparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		T_C_Employee e1 =(T_C_Employee)o1;
		T_C_Employee e2 =(T_C_Employee)o2;
		String s1 = e1.name;
		String s2 = e2.name;
		return s1.compareTo(s2);
	}

}
