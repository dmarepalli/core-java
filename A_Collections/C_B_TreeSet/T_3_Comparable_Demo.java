package C_B_TreeSet;

import java.util.TreeSet;

public class T_3_Comparable_Demo {

	public static void main(String[] args) {
		/**
		 * obj1.compareTo(obj2)
		 * 
		 * returns -ve iff obj1 has to come before obj2
		 * returns +ve iff obj1 has to come after obj2
		 * returns 0 iff obj1 & obj2 are equal
		 * 
		 */
		System.out.println("A".compareTo("Z"));
		System.out.println("K".compareTo("A"));
		System.out.println("A".compareTo("A"));
		System.out.println("A".compareTo(null)); // NullPointerException
		
		/**
		 * If we are depending on default natural sorting order, internally
		 * JVM calls compareTo method to sort the objects.
		 */
		
		TreeSet s = new TreeSet();
		s.add("A"); 
		s.add("Z"); // "Z".compareTo("A") -ve
		s.add("B"); // "B".compareTo("A") +ve
					// "B".compareTo("Z") -ve
		s.add("A"); // "A".compareTo("A") 0
		
	}
}
