package OOPS_3_Automatic_Promotion_In_Overloading_1;

public class Example5 {

	public void foo(int i){
		System.out.println("General method");
	}
	public void foo(int... i){
		System.out.println("Var-arg version");
	}
	public static void main(String[] args) {
		Example5 example5 = new Example5();
		example5.foo();
		example5.foo(10);
		example5.foo(10,20);
	}
}
