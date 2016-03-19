package G_3_throw;

public class T_3_Demo3 extends RuntimeException{

	public static void main(String[] args) {
		
		throw new T_3_Demo3(); 
		// We can use throw to throw only for "Throwable" type 
	}
	
}
