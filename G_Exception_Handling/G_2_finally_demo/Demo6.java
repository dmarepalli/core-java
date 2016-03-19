package G_2_finally_demo;

public class Demo6 {
public static void main(String[] args) {
	try{
		System.out.println(10/0);
	}catch(ArithmeticException e){
		System.out.println(10/0);
	}finally{
		String s = null;
		System.out.println(s.length());
	}
	/** Default Exception handler can handle only one exception at a time.
	 *  which is the most recently raised exception.
	 */
}
}
