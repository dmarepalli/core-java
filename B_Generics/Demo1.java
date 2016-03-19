import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Demo1 {
public static void main(String[] args) {
	/** Conclusion:
	 *  Polymorphism concept is applicable only for base type but not for parameter type.
	 *  
	 *  Usage of parent object to hold child objects..
	 */
	
	// Here ArrayList is basetype and String is parameter type.
	ArrayList<String> a = new ArrayList<String>();
	List<String> l = new ArrayList<String>();
	Collection<String> c = new ArrayList<String>();
	
	//ArrayList<Object> a1 = new ArrayList<String>(); Compile Time Error
			
}
}
