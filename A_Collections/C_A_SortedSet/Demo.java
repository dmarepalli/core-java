package C_A_SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class Demo {
public static void main(String[] args) {
	SortedSet s = new TreeSet();
	s.add(100);
	s.add(101);
	s.add(102);
	s.add(104);
	s.add(106);
	s.add(107);
	
	System.out.println(s.first());
	System.out.println(s.last());
	System.out.println(s.headSet(102)); // elements that are less than 102
	System.out.println(s.tailSet(104)); // elements that are greater than or equal to 103
	System.out.println(s.subSet(102, 106));// elements >= 102 and < 106
	System.out.println(s.comparator()); // returns comparator object that describes
										// underlying sorting technique
	// If we are using default natural sorting order then it returs null
}
}
