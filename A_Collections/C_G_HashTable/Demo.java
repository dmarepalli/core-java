package C_G_HashTable;

import java.util.Hashtable;

public class Demo {
public static void main(String[] args) {
	Hashtable t = new Hashtable();
	/**
	 * Creates an empty HashTable with default initial capacity 11
	 * fill ratio 0.75
	 */
	
	t.put(new Temp(5), "A");
	t.put(new Temp(2), "B");
	t.put(new Temp(6), "C");
	t.put(new Temp(15), "D");
	t.put(new Temp(23), "E");
	t.put(new Temp(16), "F");
	//t.put("Bob", null);
	System.out.println(t);
}
}
