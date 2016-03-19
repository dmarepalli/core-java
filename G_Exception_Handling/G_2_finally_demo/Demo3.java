package G_2_finally_demo;

public class Demo3 {

	public static void main(String[] args) {
		try{
			System.out.println("try");
			System.out.println(10/0);
		}catch(NullPointerException e){
			System.out.println("catch");
		}finally{
			System.out.println("Finally");
		}
	}
}
