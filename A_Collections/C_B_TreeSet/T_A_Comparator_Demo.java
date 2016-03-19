package C_B_TreeSet;

import java.util.TreeSet;

public class T_A_Comparator_Demo {
/**
 * WAP to insert string and StringBuffer objects into TreeSet where sorting order
 * is increasing length order. If two objects have same length consider their alphabetical order.
 */
	
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new T_B_MyComparator());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		System.out.println(t);
	}
}
