package C_B_TreeSet;

import java.util.TreeSet;

public class T_6_Comparator_Demo {
	public static void main(String[] args) {
		TreeSet t = new TreeSet(new T_7_MyComparator());
		t.add("Robert");
		t.add("Solman");
		t.add("Rodriguez");
		t.add("Gabriel");
		t.add("Radcliff");
		System.out.println(t);
		
	}
	

	
}
