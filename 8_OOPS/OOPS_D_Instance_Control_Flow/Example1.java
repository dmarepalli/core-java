package OOPS_D_Instance_Control_Flow;

public class Example1 {

	int x = 10;
	
	{
		foo();
		System.out.println("First Instance Block");
	}
	
	Example1(){
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		Example1 test = new Example1();
		System.out.println("Main");
	}
	public void foo(){
		System.out.println(y);
	}
	
	{
		System.out.println("Second Instance Block");
	}
	
	int y = 20;
	
}
