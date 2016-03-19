package G_2_finally_demo;

public class Demo1 {

	public static void main(String[] args) {
		try{
			System.out.println("Try");
		}catch(ArithmeticException e){
			System.out.println("catch");
		}finally{
			System.out.println("finally");
		}
	}
}
