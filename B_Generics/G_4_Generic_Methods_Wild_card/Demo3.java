package G_4_Generic_Methods_Wild_card;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class Demo3 {
	public static void main(String[] args) {
		foo(new ArrayList<Object>());
	}
	
	public static void foo(ArrayList<? super String> l){
		
		l.add(new String());
	}
}
