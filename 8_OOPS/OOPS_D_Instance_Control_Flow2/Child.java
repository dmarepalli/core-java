package OOPS_D_Instance_Control_Flow2;

public class Child extends Parent{

	int i = 100;
	{
		boo();
		System.out.println(" Child Instance Block");
	}
	
	Child(){
		System.out.println(" Child Constructor");
	}
	
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(" Child Main");
	}
	public void boo(){
		System.out.println("j");
	}
	{
		System.out.println("Second Child instance block");
	}
	int j=200;
}
