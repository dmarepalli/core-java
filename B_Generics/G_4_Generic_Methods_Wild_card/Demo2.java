package G_4_Generic_Methods_Wild_card;

import java.util.ArrayList;

public class Demo2 {

	public static void main(String[] args) {
		foo(new ArrayList<Integer>());
	}
	
	public static void foo(ArrayList<? extends Number> l){
		
		
		
	//	l.add(1); // not valid
	//	l.add("John"); // not valid
		l.add(null);
	}
}
