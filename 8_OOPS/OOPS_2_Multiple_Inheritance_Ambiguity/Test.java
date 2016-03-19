package OOPS_2_Multiple_Inheritance_Ambiguity;

public class Test implements Child{

	
	public static void main(String[] args) {
		
		Left left = new Test();
		left.foo();
		
		Right right = new Test();
		right.foo();
		
		// Multiple inheritance applicable for interfaces but not classes
	}

	@Override
	public void foo() {

		System.out.println("Hello");
	}

}
