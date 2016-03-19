
public class StringDemo {
public static void main(String[] args) {
	String s1 = new String("John");
	String s2 = new String("John");
	String s3 = "John";
	String s4 = "John";
	
	/**
	 * 			Heap			String Constant Pool
	 *			----			--------------------
	 *		s1-> John				John<-s3,s4
	 *		s2-> John
	 */
}
}
