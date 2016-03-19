package C_B_TreeSet;

import java.util.TreeSet;

public class T_4_Comparator_Demo {
public static void main(String[] args) {
	TreeSet t = new TreeSet(new T_5_MyComparator());
	t.add(10);
	t.add(15);
	t.add(5);
	t.add(20);
	t.add(20);
	System.out.println(t);
	
}
	
	
	
}
