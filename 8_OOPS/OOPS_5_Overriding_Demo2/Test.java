package OOPS_5_Overriding_Demo2;

public class Test {

	
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.foo();
		
		Child child = new Child();
		child.foo();
		
		
	}
	/**
	 * Co-variant type return types are allowed.
	 * Child class's overriding method return type need not be same
	 * as parent class's overridden method. Its child types are also
	 * allowed.
	 */
}
