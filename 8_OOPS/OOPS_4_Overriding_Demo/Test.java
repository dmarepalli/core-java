package OOPS_4_Overriding_Demo;

public class Test {
public static void main(String[] args) {
	Parent parent = new Parent();
	parent.marry(); // Lisa
	
	Child child = new Child();
	child.marry(); // Sandy
	
	Parent parent2 = new Child();
	parent2.marry(); // Sandy
}
/**
 * In method overriding, resolution is always chosen based on
 * run time object.
 * 
 * Hence overriding is also called run time polymorphism,
 * dynamic polymorphism
 * late binding
 */
}
