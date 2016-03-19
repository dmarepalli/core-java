
public class Array_6_UnInitializedArrays {

	int[] a;
	int[] b = new int[3];
	
	static int[] c;
	static int[] d = new int[3];
	
	public static void main(String[] args) {
	
		Array_6_UnInitializedArrays array = new Array_6_UnInitializedArrays();
		System.out.println(array.a); // null
		System.out.println(array.a[0]); // NullPointerException
		
		System.out.println(array.b); // [I@1ab234
		System.out.println(array.b[0]); // 0 
		
		
		System.out.println(c); // null
		System.out.println(c[0]); // NullPointerException
		
		System.out.println(d); // [I@1ab234
		System.out.println(d[0]); // 0
		
		int[] e;
		int[] f = new int[3];
		
	  //System.out.println(e); //=> Compile Time Error
	  //System.out.println(e[0]); //=> Compile Time Error
		
		System.out.println(f); // [I@1ab234
		System.out.println(f[0]); // 0
		
		
		
		
	}
			
	
	
}
