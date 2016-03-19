
public class Array_8_VarArgs_Demo2 {

	public static void m1(int...i){
		System.out.println("var-args method");
	}
	/*public static void m1(int[] i){
		// CAN NOT declare m1(int...i) and m1(int[] i) at a time
	}*/
	public static void m1(int i){
		System.out.println("Normal method");
	}
	public static void main(String[] args) {
		m1();
		m1(10);
		m1(10,20);
	}
}
