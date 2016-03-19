package OOPS_9_Method_Hiding;

public class Test {
public static void main(String[] args) {
	
	// Complie time polymorphism
	Parent parent = new Parent();
	parent.foo();
	
	Child child = new Child();
	child.foo();
	
	Parent parent2 = new Child();
	parent2.foo();
}
}
