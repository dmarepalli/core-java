
public class Modifiers_7_Final_Static_Variables {
/*
 * final static variables should be initialized before class loading.
 */
	
	final static int x;
	
	static{
		x=10; // inside static block
	}
	
	public void m1(){
		//x=10; we can not do this
	}
	
	public static void m2(){
		//x=10; we can not do this
	}
}
