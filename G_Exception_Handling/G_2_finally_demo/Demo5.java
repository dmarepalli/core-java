package G_2_finally_demo;

public class Demo5 {
public static void main(String[] args) {
	try{
		System.out.println("try");
		System.exit(0);
	}catch(Exception e){
		System.out.println("catch");
	}finally{
		System.out.println("finally");
		// exit(0) dominates finally. So finally block does not run this case.
	}
}
}
