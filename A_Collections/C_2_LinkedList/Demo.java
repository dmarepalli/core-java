package C_2_LinkedList;

import java.util.LinkedList;

public class Demo {

	/**
	 * Underlying data structure is double linked list
	 * Insertion order is preserved
	 * duplicate elements are allowed.
	 * Heterogeneous elements are allowed.
	 * Null insertion is possible.
	 * Implements Serializable and Clonable
	 * Best suitable if our frequent operation is insertion
	 * 
	 */
	
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("John");
		l.add(30);
		l.add(null);
		l.add("John"); //[John,30,null,John]
		l.set(0, "Bob"); //[Bob,30,null,John]
		l.add(0,"Robert"); //[Robert,Bob,30,null,John]
		l.removeLast(); //[Robert,Bob,30,null]
		l.addFirst("LOL"); //[LOL,Robert,Bob,30,null]
		System.out.println(l);
		
	}
}
