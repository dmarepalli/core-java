package C_E_SortedMap;

import java.util.TreeMap;

public class Demo {
public static void main(String[] args) {
	TreeMap m = new TreeMap();
	m.put(1, "A");
	m.put(2, "B");
	m.put(3, "C");
	m.put(4, "D");
	
	System.out.println(m.firstKey());
	System.out.println(m.lastKey());
	System.out.println(m.headMap(2));
	System.out.println(m.tailMap(3));
	System.out.println(m.subMap(1, 3));
	
}
}
