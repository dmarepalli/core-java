
public class Array_7_VarArgs_Demo1 {

	public static void main(String[] args) {
		sum();
		sum(10);
		sum(10,20);
		sum(10,20,30,40);
	}
	
	public static void sum(int... values){
		int total=0;
		for(int i:values){
			total+=i;
		}
		System.out.println(total);
	}
	

	// m1(int x, String... y) -> We can mix var-args with noraml parameters
	// m1(int...x, String y) -> NOT VALID: var-args parameter should be last parameter
	// m1(int...x, String... y) -> NOT VALID: we can have only one var-args parameter per a method
	
		
}

