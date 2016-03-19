package OOPS_B_Overriding_Variables;

public class Test {
public static void main(String[] args) {
	
	/**
	 * Overriding is not applicable for variables.
	 * 
	 * Variable resolution always taken care by compiler based on 
	 * reference type.
	 * 
	 * This rule is same for static or non-static variables.
	 */
	
	Parent parent = new Parent();
	System.out.println(parent.x);
	
	Child child = new Child();
	System.out.println(child.x);
	
	Parent parent2 = new Child();
	System.out.println(parent2.x);
	
}
}
