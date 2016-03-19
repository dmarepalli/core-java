package C_7_ListIterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
public static void main(String[] args) {
	/**
	 * Bidirectional cursor
	 * only available for list objects.
	 */
	
	LinkedList list = new LinkedList();
	
	list.add("Leo");
	list.add("Tom");
	list.add("Arnold");
	list.add("smith");
	
	System.out.println(list);
	
	ListIterator iterator = list.listIterator();
	while(iterator.hasNext()){
		String name = (String)iterator.next();
		
		if(name.equals("Tom")){
			iterator.remove();
		}
	}
	System.out.println(list);
	ListIterator iterator1 = list.listIterator();
	while(iterator1.hasNext()){
		String name = (String)iterator1.next();
		
		if(name.equals("Leo")){
			iterator1.set("John");
		}
	}
	System.out.println(list);
	ListIterator iterator2 = list.listIterator();
	while(iterator2.hasNext()){
		String name = (String)iterator2.next();
		
		if(name.equals("smith")){
			iterator2.add("will");
		}
	}
	System.out.println(list);
}
}
