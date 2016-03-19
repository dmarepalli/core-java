package OOPS_9_Method_Hiding;

public class Child extends Parent {

	public static void foo(){
		System.out.println("Child-static");
		/**
		 * It is valid. It is called method hiding but not method
		 * overriding.
		 */
	}
}
