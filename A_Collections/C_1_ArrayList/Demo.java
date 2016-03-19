package C_1_ArrayList;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class Demo {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		/**
		 * Above statement creates an empty arraylist object with
		 * initial default capacity 10.
		 * Once it reaches max capacity then a new array list will be created
		 * with new capacity.
		 * 
		 * new capacity = currunt capacity *3/2 + 1
		 * 
		 * We can also create array list with customized initial cap
		 *  ArrayList arrayList = new ArrayList(initialsize);
		 */
		arrayList.add("A"); 
		arrayList.add(10);
		arrayList.add("A");
		arrayList.add(null);
		System.out.println(arrayList); //[A,10,A,null]
		arrayList.remove(2);
		System.out.println(arrayList); //[A,10,null]
		arrayList.add(2, "M");
		arrayList.add("N");
		System.out.println(arrayList); //[A,10,M,null,N]
		System.out.println(arrayList.size());
		arrayList.addAll(((Collection)arrayList));
		arrayList.clear();
		
		/**
		*Every collection class implements Serializable and Clonable
		*/
		
		System.out.println(arrayList instanceof Serializable);
		System.out.println(arrayList instanceof Cloneable);
		System.out.println(arrayList instanceof RandomAccess);
		



/**
*ArrayList & Vector classes implements RandomAccess interface. So any
*random element can be accessed with same speed. Hence if frequent
*retrieval operation is the goal then choosing ArrayList is better.
*/

/**
* No method in arrayList is synchronized
* Every method in vector is synchronized
*/
		
/** Getting sychronized version of ArrayList*/
		
ArrayList l2 = (ArrayList) Collections.synchronizedList(arrayList);
		
	}
}