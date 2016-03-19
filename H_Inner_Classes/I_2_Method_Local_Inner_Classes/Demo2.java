package I_2_Method_Local_Inner_Classes;

public class Demo2 {
	static int x = 10;
	int y = 20;
	public void foo(){
		int z =10;
		class Inner{
			public void bar(){
				
				System.out.println(x);
				System.out.println(y);
				// we can not access z here unless it is declared as final
			}
		}
		
		Inner i = new Inner();
		i.bar();
		
	}
	public static void foo1(){
		
		class Inner{
			public void bar(){
				
				System.out.println(x);
		//		System.out.println(y);
				/**
				 * If we declare inner class inside a static method then
				 * we can access only static members of outer class. we can not access
				 * instance variables of outer class. 
				 */
			}
		}
		
		Inner i = new Inner();
		i.bar();
		
	}
	public static void main(String[] args) {
		new Demo2().foo();
	}
}
