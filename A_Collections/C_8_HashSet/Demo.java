package C_8_HashSet;

import java.util.HashSet;

public class Demo {
public static void main(String[] args) {
	/**
	 * Best for search operations.
	 * Duplicate objects are not allowed
	 * If we try to insert a duplicate we dont get any compile time
	 * error or run time exception, the add() returns false.
	 */
	HashSet s = new HashSet();
	/**
	 * Creates an empty HashSet object with specified initial capacity 16
	 * and default fill ratio/ load factor 0.75
	 * 
	 * Other constructors
	 * 
	 * HashSet(int initialCapacity)
	 * HashSet(int initialCapacity,float fillRatio)
	 * HashSet(Collection c)
	 * 
	 */
	
	s.add("A");
	s.add("B");
	s.add("C");
	s.add("Z");
	s.add(null);
	s.add(10);
	System.out.println(s.add("Z"));
	System.out.println(s);
	
}
}
