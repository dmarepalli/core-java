package G_2_finally_demo;

public class Demo4 {
public static void main(String[] args) {
	try{
		System.out.println("try");
		return;
	}catch(Exception e){
		System.out.println("catch");
	}finally{
		System.out.println("finally");
		// finally dominates return. finally block must be executed before method retuns
	}
}
}
