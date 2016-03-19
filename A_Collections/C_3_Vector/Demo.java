package C_3_Vector;

import java.util.Vector;

public class Demo {
public static void main(String[] args) {
	Vector v = new Vector();
	/**
	 * Creates an empty vector object with default initial capacity 10
	 * 
	 * once vector reaches its max capacity a new vector object will be
	 * created with double capacity
	 * 
	 * new capacity = 2 * current capacity
	 */
	System.out.println(v.capacity());
	for(int i =0;i<=10;i++){
		v.addElement(i);
	}
	System.out.println(v.capacity());
	//System.out.println(v.size());
	v.addElement("A");
	System.out.println(v.capacity());
	System.out.println(v.size());
}
}
