package I_1_Normal_Inner_Classes;
/**
 * 
 * Accessing inner class content from instance area of outer class
 *
 */
public class Demo3 {

	class Inner{
		public void foo(){
			System.out.println("Inner content..");
		}
	}
	
	public void m1(){
		Inner i = new Inner();
		i.foo();
	}
	
	public static void main(String[] args) {
		Demo3 d = new Demo3();
		d.m1();
	}
	
}
