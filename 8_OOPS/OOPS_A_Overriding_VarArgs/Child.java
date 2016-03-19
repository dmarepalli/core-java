package OOPS_A_Overriding_VarArgs;

public class Child extends Parent{

	
	public void foo(int i){
		// It looks like overriding but it is overloading
		// We should override var-arg method with var-arg only
		System.out.println("General method");
	}
}
