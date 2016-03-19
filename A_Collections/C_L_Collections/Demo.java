package C_L_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
public static void main(String[] args) {
	List l = new ArrayList();
	l.add(5);
	l.add(7);
	l.add(3);
	l.add(9);
	l.add(2);
	l.add(1);
	Collections.sort(l);
	System.out.println(l);
	
	//Collections.sort(List l, Comparator c) for custom sorting
	
	System.out.println(Collections.binarySearch(l, 2));
	
	Collections.reverse(l);
	System.out.println(l);
	
	

	
}
}
