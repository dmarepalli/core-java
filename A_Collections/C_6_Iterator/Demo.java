package C_6_Iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Demo {
public static void main(String[] args) {
	/**
	 * Can be applied to any collection object.
	 * Universal Cursor
	 */
	
	ArrayList l = new ArrayList();
	for(int i=0;i<10;i++){
		l.add(i);
	}
	
	Iterator i = l.iterator();
	while(i.hasNext()){
		Integer in = (Integer)i.next();
		if(in%2==0){
			System.out.println(in);
		}else{
			i.remove();
		}
	}
	System.out.println(l);
		
}
}
/**
* Limitations: Unidirectional. We can only move forward.
* We can not perform replace and addition of new objects.
*/