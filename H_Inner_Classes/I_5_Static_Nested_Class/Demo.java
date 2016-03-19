package I_5_Static_Nested_Class;

public class Demo {
	static int x =10;
	int y=20;
	static class Nested{
		public void m1(){
			System.out.println("Static nested method!!");
			System.out.println(x);
			//System.out.println(y); // we can not access non-static members
		}
		
		public static void m2(){
			/**
			 * We can have static members also in static inner class
			 */
		}
	}
	
	public static void main(String[] args) {
		new Demo.Nested().m1();
	}
}
