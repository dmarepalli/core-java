package OOPS_3_Automatic_Promotion_In_Overloading_1;

public class Example4 {

	public void foo(int i, float f){
		System.out.println("int-float version");
	}
	public void foo(float f, int i){
		System.out.println("float-int version");
	}
	public static void main(String[] args) {
		Example4 example4 = new Example4();
		example4.foo(10, 10.5f);
		example4.foo(10.5f, 10);
//		example4.foo(10, 10);
//		example4.foo(10.5f, 10.5f);
	}
}
