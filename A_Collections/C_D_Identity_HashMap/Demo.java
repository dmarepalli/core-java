package C_D_Identity_HashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class Demo {

	public static void main(String[] args) {
		// HashMap uses .equals() to identify the duplicate keys (content comparison)
		HashMap m = new HashMap();
		Integer I1 = new Integer(10);
		Integer I2 = new Integer(10);
		m.put(I1, "Bob");
		m.put(I2, "Cris"); // I1.equals(I2) is true. Hence it is a duplicate key
		System.out.println(m);
		
		
		// IDentityHashMap uses "==" to identify the duplicate keys. (reference comparison)
		IdentityHashMap m1 = new IdentityHashMap();
		Integer I3 = new Integer(10);
		Integer I4 = new Integer(10); 
		m1.put(I3, "Bob");
		m1.put(I4, "Cris"); // I3==I4 is false. Hence it is not a duplicate key
		System.out.println(m1);
		
	}
	
}
