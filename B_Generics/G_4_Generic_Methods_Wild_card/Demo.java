package G_4_Generic_Methods_Wild_card;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		foo(new ArrayList<String>());
	}
	
	public static void foo(ArrayList<?> l){
		
		// This type of methods are best for reading. we can only read list we can not add anything
		
	//	l.add(1); // not valid
	//	l.add("John"); // not valid
		l.add(null);
	}
}
