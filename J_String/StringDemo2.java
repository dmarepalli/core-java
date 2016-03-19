
public class StringDemo2 {
public static void main(String[] args) {
	String s = "John"+new String("John");
	
	/**
	 * 
	 * 	Heap           SCP
	 *  ====           ====
	 *  John			John
	 *  
	 *  s->JohnJohn
	 * 
	 * 
	 */
}
}
