package OOPS_A_Overriding_VarArgs;

public class Test {
public static void main(String[] args) {
	Parent parent = new Parent();
	parent.foo(10); //var-args
	
	Child child = new Child();
	child.foo(10); //general
	
	Parent parent2 = new Child();
	parent2.foo(10); // var-args
	
	
	
}
}
