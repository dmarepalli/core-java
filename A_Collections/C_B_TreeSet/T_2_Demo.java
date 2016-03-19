package C_B_TreeSet;

import java.util.TreeSet;

public class T_2_Demo {
public static void main(String[] args) {
	TreeSet s = new TreeSet();
	s.add(new StringBuffer("A"));
	s.add(new StringBuffer("Z"));
	s.add(new StringBuffer("L"));
	s.add(new StringBuffer("B"));
	System.out.println(s);
	
	// Exception: StringBuffer cannot be cast to Comparable
	/**
	 * Conclusion: If we are depending on default natural sorting order
	 * then objects must be comparable
	 * i.e., corresponding class should implement Comparable interface
	 * 
	 * Here StringBuffer does not implement Comparable interface
	 */
	
}
}
