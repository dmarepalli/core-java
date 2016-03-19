package C_C_HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		/**
		 * Above statement creates an empty HashMap object with default initial capacity 16
		 * and default fill ratio/load factor 0.75
		 * 
		 * By default HashMap is not synchronized
		 * 
		 * Duplicate keys are not allowed
		 * null can be inserted as key only once. no restrictions on values.
		 */
		m.put("Cris", 700);
		m.put("Bob", 800);
		m.put("Viru", 200);
		m.put("nero", 500);
		
		System.out.println(m);
		System.out.println(m.put("Cris", 1000));
		
		Set s = m.keySet();
		System.out.println(s);
		
		Collection c = m.values();
		System.out.println(c);
		
		Set s1 = m.entrySet();
		System.out.println(s1);
		
		Iterator itr = s1.iterator();
		
		while(itr.hasNext()){
		Map.Entry m1 =	(Map.Entry)itr.next();
		System.out.println(m1.getKey()+"....."+m1.getValue());
		if(m1.getKey().equals("nero")){
			m1.setValue(10000);
		}
		}
		
		System.out.println(m);
	}
	
}

