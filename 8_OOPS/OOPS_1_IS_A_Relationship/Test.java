package OOPS_1_IS_A_Relationship;

public class Test {
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.m1();
		// parent.m2(); Compile Time Error
		/**
		 * On parent class reference we can call only parent class methods. we
		 * can not call child class methods.
		 */

	
		
		
		Child child = new Child();
		child.m1();
		child.m2();
		/**
		 * On child class reference, we can call both parent class and
		 * child class methods.
		 */
		
		
		
		Parent parent2 = new Child();
		parent2.m1();
		//parent2.m2(); Compile Time Error
		/**
		 * Parent class reference can be used to hold child class object.
		 * By using that reference,  we can call only parent class methods
		 * but we can not call child specific methods.
		 * 
		 */
		
		
		
		
		//Child child2 = new Parent();
		/**
		 * We can not use child class reference to hold parent class object.
		 */
	}

}
