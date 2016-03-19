package Interfaces_3_Variable_Naming_Conflict;

public class Test implements Right,Left{

	public static void main(String[] args) {
		/**
		 * There may be a chance of two interfaces containing same
		 * variable name & may rise conflicts. Below statement
		 * gives compile time error says x value is ambiguous.
		 */
		//System.out.println(x); 
		
		// We can solve this problem by by referring the interface name
		
		System.out.println(Right.x);
		System.out.println(Left.x);
	}
	
}
