package Interfaces_2_Method_Naming_Conflicts_2;

public class Test implements Right,Left{
	
	/**
	 * If two interfaces contains a method with same name but with
	 * different arguments then, in the implementation class we have to
	 * provide implementation for both methods and these are called overloaded
	 * methods.
	 */

	@Override
	public void foo(int i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void foo() {
		// TODO Auto-generated method stub
		
	}

}
