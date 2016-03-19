
public class Array_5_ElementAssignment {

	public static void main(String[] args) {
		
		// As array elements to primitive type arrays,
		// we can provide any type which can be promoted to declared type.
		
		int[] a = new int[10];
		a[0] = 10;
		a[1] = 'a'; // valid
		
		byte b = 10;
		a[2] = b;
		
		short s = 20;
		a[3] = s; // valid
		
	  //a[4] = 10l; Compile time error
	  //a[5] = 10.5; Compile time error 	
		
	  // For float type array, the allowed element types are byte, short, char, int, long, float
	
		
// In case of object type arrays as array elements, we can provide either declared type 
// or its child class objects.
		
		Number[] n = new Number[10];
		n[0] = new Integer(10);
		n[1] = new Double(10.5);
		//n[2] = new String("Hello"); Incompatible type 
		
// In case of abstract class type arrays , we can provide its child class objects as elements.
// In case of interface type array, we can provide its implementation class objects as elements.
		
		
// When ever we assign one array to another, only reference variables will be reassigned not 
// the underlying elements. Hence types must be matched but not the size.
		
		int[] c = {10,20,20,40,50};
		int[] d = {1,2};
		
		c=d; // valid
		d=c; // valid
		
		
	}
}
