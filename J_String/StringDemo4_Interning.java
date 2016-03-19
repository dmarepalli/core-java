
public class StringDemo4_Interning {
public static void main(String[] args) {
	String s1 = new String("John");
	/**
	 * By using heap object reference, if we want to get corresponding 
	 * SCP object reference then we can use intern() 
	 */
	String s2 = s1.intern();
	System.out.println(s1==s2);
	String s3 = "John";
	System.out.println(s2==s3);
	
	/**
	 * if corresponding object is not available in SCP, then intern creates
	 * that object and returns it.
	 */
	
	String s4 = new String("Bob");
	String s5 = s4.concat("Company");
	String s6 = s5.intern();
	String s7 = "BobCompany";
	System.out.println(s3==s4);
}
}
