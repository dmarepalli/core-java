package G_3_throw;

public class T_2_Demo2 {
	static ArithmeticException e;
public static void main(String[] args) {
	throw e;
	//System.out.println("Hello"); // after throw we can not write any code
	// e is null then we will get NullPinterException not ArithmeticException
}
}
