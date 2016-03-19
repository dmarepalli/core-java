
public class Constructor_3_Overloading {

	public Constructor_3_Overloading(double d) {
	
		this(10);
		System.out.println("double args");
	}
	
	public Constructor_3_Overloading(int i) {
		this();
		System.out.println("int args");
	}
	public Constructor_3_Overloading() {
		System.out.println("no args");
	}
	public static void main(String[] args) {
		Constructor_3_Overloading t1 = new Constructor_3_Overloading(10.5);
		Constructor_3_Overloading t2 = new Constructor_3_Overloading(10);
		Constructor_3_Overloading t3 = new Constructor_3_Overloading();
	}
	
/**
 * Recursive method call is always a runtime exception
 * Recursive constructor call is always a compile time error.
 * 	
 */
/**
 * If parent class constructor is throwing some checked exception then
 * child class constructor should also throw same exception or its parent
 */
}
