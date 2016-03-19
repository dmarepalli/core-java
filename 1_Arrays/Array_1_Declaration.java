public class Array_1_Declaration {
	public static void main(String[] args) {
		// Single Dimensional array declaration
		int[] array1; // This is recommended
		int array2[];
		int []array3;
		
		// We can not specify the size while declaring
		//int array4[5]; ==> Gives compilation error.
		
		
		// Two Dimensional array delcleration
		
		int[][] a; // This is recommended.
		int [][]b;
		int c[][];
		int[] d[];
		int[] []e;
		int []f[];
		
		// Three Dimensional array decleration
		
		int[][][] g;
		int h[][][];
		int [][][]i;
		int[] j[][];
		int[][] k[]; // etc..
		
		
		// Exercise
		
		int[] l,m; //=> Here size of the array l is 1 and size of m is also 1
		int[] n[],o; //=> Here size of the array n is 2 and size of o is 1
		int[] []p,q; //=> Here size of the arrays p and q is 2
		int[] []r,s[]; //=> Here size of the array r is 2 and size of s is 3
	  //int[] []r,[]s; //=> Gives compile time error. Specifying dimension is only allowed for first variable	
		
		
		
		
		
		
		
	}
}
