package C_B_TreeSet;

import java.util.Comparator;
public class T_9_MyComparator implements Comparator{

	
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return -s1.compareTo(s2);
	}

}
