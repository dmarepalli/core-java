import static java.lang.Integer.*;
import static java.lang.Byte.*;
public class Static_2_Ambiguity {

	public static void main(String[] args) {
		//System.out.println(MAX_VALUE); 
	}
	
	/**
	 * Two classes contains a variable or method with same name.
	 * Hence ambiguity problem is common in static import.
	 * 
	 * While resolving static members compiler follows the following
	 * precedence.
	 * 
	 * 1. current class static members.
	 * 2. Explicit static import.
	 * 3. Implicit static import.
	 * 
	 */
}
