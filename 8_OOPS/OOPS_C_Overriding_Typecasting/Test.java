package OOPS_C_Overriding_Typecasting;

public class Test {
public static void main(String[] args) {
	Child child = new Child();
	child.foo();
	((Parent)child).foo();
	((GrandParent)((Parent)child)).foo();
}
}
