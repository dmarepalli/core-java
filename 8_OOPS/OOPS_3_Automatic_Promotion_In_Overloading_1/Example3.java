package OOPS_3_Automatic_Promotion_In_Overloading_1;

public class Example3 {

	
	public void foo(StringBuffer sb){
		System.out.println("String Buffer Version");
	}
	
	public void foo(String s){
		System.out.println("String Version");
	}
	public static void main(String[] args) {
		Example3 example3 = new Example3();
		example3.foo(new StringBuffer("John"));
		example3.foo("John");
		//example3.foo(null); CE: reference to foo is ambiguous
	}
}
