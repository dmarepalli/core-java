package G_1_Demo;

public class Demo {

	public static void main(String[] args) {
		try{
			System.out.println(10/0);
		}catch(ArithmeticException e){
			
			e.printStackTrace();
			/**
			 * The above method prints exception information in the following format.
			 * 
			 * Name of Exception: description
			 * Stacktrace
			 */
			
			e.toString();
			/**
			 * The above method prints exception information in the following format.
			 * 
			 * Name of Exception: description
			 */
			
			e.getMessage();
			/**
			 * The above method prints exception information in the following format.
			 * 
			 * description
			 */
		}
	}
}
