package C_B_TreeSet;

import java.util.TreeSet;

public class T_1_Demo {

	public static void main(String[] args) {
		/**
		 * Data structure : Balanced Tree
		 * Duplicates are not allowed
		 * elements are sorted (in some order)
		 * Heterogeneous Objects can not be inserted
		 * If we try to insert heterogeneous, we will get run time
		 * exception: ClassCastException
		 * null can be inserted. (But only once)
		 */
		/**
		 * Constructors:
		 * 
		 * TreeSet(); -> creates empty TreeSet. Elements will be inserted
		 * according to natural sorting order.
		 * 
		 * TreeSet(Comparator c) -> Creates empty TreeSet. Elements will be 
		 * inserted according to customized sorting order described by comparator object 
		 * 
		 * TreeSet(Collection c)
		 * 
		 * TreeSet(SortedSet s)
		 */
		
		
		TreeSet t = new TreeSet();
		t.add("A");
		t.add("a");
		
		t.add("B");
		t.add("Z");
		t.add("L");
	//	t.add(10); ClassCastException
	//	t.add(null); NullPointerException
		
		/**
		 * For empty TreeSet, as the first element null insertion is 
		 * possible. but after that anything else can not be inserted
		 * because comparison will null leads to NullPointerException
		 * 
		 *  For a non empty TreeSet null insertion gives NullPointerException
		 *  
		 */

	}
}
