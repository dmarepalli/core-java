package I_1_Normal_Inner_Classes;
/**
 * 
 * Accessing inner class code from static area of outer class
 *
 */
public class Demo2 {

	
	static int x=10;
	int y = 20;
	
	class Inner{
		public void foo(){
			/**
			 * in inner class, we can access all contents members of outer class
			 * (static and no-static) directly.
			 */
			System.out.println(x);
			System.out.println(y);
			System.out.println("Inner class method");
		}
	}
	
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		Demo2.Inner i = d.new Inner();
		i.foo();
		
		//or
		
		new Demo2().new Inner().foo();
		
		/**
		 * To access the inner class content from some external class 
		 * we can use the same above syntax
		 */
	
	}
	
}
