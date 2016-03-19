package OOPS_3_Automatic_Promotion_In_Overloading_1;

public class Example2 {

	public void foo(Object o){
		System.out.println("Object version");
	}
	
	public void foo(String s){
		System.out.println("String Version");
	}
	public static void main(String[] args) {
		Example2 example2 = new Example2();
		example2.foo(new Object());
		example2.foo("John");
		example2.foo(null);
	}
}
