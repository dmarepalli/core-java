
public class Array_2_Construction {
public static void main(String[] args) {
	// Every array in java is an object. 
	
	
	// =====>Construction of Single Dimensional Arrays<========//
	int[] a = new int[3];
	
	// At the time of construction we must specify the size
	//int[] a = new int[]; => Gives compile time error.
	
	int[] b = new int[0]; //=> Legal to have zero size array
	
	int[] c = new int[-6]; //=> no compile time error but gives run time exception
	
	// Array size can be specified using byte,short,int,char types of data.
	
	int[] d = new int['a']; //char type
	
	byte e = 10;
	int[] f = new int[e]; //byte type
	
	short g = 20;
	int[] h = new int[g]; //short type
	
  //int[] i = new int[58l]; // Compile time error
  //int[] j = new int[10.2]; //Compile time error
	
	
	//========> Construction of multi dimensional Arrays <=========//
	
	// In Java multi dimensional arrays are implemented by using Array of Arrays concept
	
	int[][] i = new int[3][];          
	i[0] = new int[2];
	i[1] = new int[3];
	i[2] = new int[8];
	
	
	int[][][] j = new int[2][][];
	j[0] = new int[3][];
	j[0][0] = new int[1];
	j[0][1] = new int[2];
	j[0][2] = new int[3];
	j[1] = new int[2][2];
	
	
	
	
}
}
