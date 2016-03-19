package C_B_TreeSet;

import java.util.TreeSet;

public class T_8_Comparator_Demo {
	public static void main(String[] args) {
		
	
	TreeSet t = new TreeSet(new T_9_MyComparator());
	t.add(new StringBuffer("Robert"));
	t.add(new StringBuffer("Solman"));
	t.add(new StringBuffer("Rodriguez"));
	t.add(new StringBuffer("Gabriel"));
	t.add(new StringBuffer("Radcliff"));
	System.out.println(t);
	}
}
