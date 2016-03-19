package OOPS_D_Instance_Control_Flow2;

public class Parent {

	int x = 10;
	{
		foo();
		System.out.println(" Parent Instance Block");
	}
	
	Parent(){
		System.out.println("Parent Constructor");
	}
	public static void main(String[] args) {
		Parent parent = new Parent();
		System.out.println("Parent main");
	}
	public void foo(){
		System.out.println(y);
	}
	int y = 20;
}
