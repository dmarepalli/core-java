package C_9_LinkedHashSet;

import java.util.LinkedHashSet;

public class Demo {
public static void main(String[] args) {
	/**
	 * Duplications are not allowed
	 * but insertion order is preserved
	 */
	LinkedHashSet s = new LinkedHashSet();
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
