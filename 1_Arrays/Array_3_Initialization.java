
public class Array_3_Initialization {
public static void main(String[] args) {
	// When ever we create an array, every element of array
	// will be initialized with default values
	int[] a = new int[3];
	System.out.println(a); // Prints hash code like [I@5552e7a4 // calssname@hexadecimal string of hash code
	System.out.println(a[0]); // Prints 0 default value
	
	int[][] b = new int[3][2];
	System.out.println(b); // [[I@35e5ebbf
	System.out.println(b[0]); // [I@788bf135
	System.out.println(b[0][0]); // 0
	
	int[][] c = new int[3][];
	System.out.println(c); // [[I@5d9d277e
	System.out.println(c[0]); // null
	System.out.println(c[0][0]); // Run Time Exception: Null Pointer Exception
	
	
	// Initializing values to array
	
	int[] d = new int[3];
	d[0] = 10;
	d[1] = 20;
	d[2] = 30;
	d[50] = 40; // Array Index Out of Bounds Exception
	d[-50] = 40; // Array Index Out of Bounds Exception
  //a[10.5] = 30; // Compile Time Error
	
	
	// Array Deceleration, construction and initialization in a single line
	int[] e = {10,20,30,40};
	char[] f = {'a','b'};
	String[] g = {"Bob","Robert","John"};
	
	// Multi dimensional
	
	int[][] h = {{1,2,3},{4,5,6}};
	int[][][] i = {{{1,2,3},{4,5,6}},{{7,8},{9,10,11,12}}};
	
	
	
	// We can not do like below
	
	/*int[] j;
	j={10,11,12};*/
	
	
	
	// ===> Array Length <===//
	
	int[][] j = new int[6][3];
	System.out.println(j.length); // 6
	System.out.println(j[0].length); //3
	
	
	


	
	
}
}
