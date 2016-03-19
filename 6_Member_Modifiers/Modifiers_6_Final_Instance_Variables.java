
public class Modifiers_6_Final_Instance_Variables {
/* For the final instance variable we should perform initialization
 * before constructor compilation.
 */
	
	final int x;
	
	{
		//x=10; // can be initialized inside instance block
	}
	
	Modifiers_6_Final_Instance_Variables() {
		x=10; // can be initialized inside constructor
	}
	
	public void m1(){
		
		//x=10; We can not do this
	}
}
