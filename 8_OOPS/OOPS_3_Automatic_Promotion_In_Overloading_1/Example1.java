package OOPS_3_Automatic_Promotion_In_Overloading_1;

public class Example1 {

	public void foo(int i){
		System.out.println("int-args");
	}
	public void foo(float f){
		System.out.println("float-args");
	}
	public static void main(String[] args) {
		Example1 example1 = new Example1();
		example1.foo(10); // exact match of foo(int i)
		example1.foo(10.5f); // exact match of foo(float f)
		example1.foo('a'); // promoted to foo(int i)
		example1.foo(10l); // promoted to foo(float f)
		//test.foo(10.5); // compile time error
	}
	
	
}
