import java.util.Date;


public class RunTimeDemo {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());
		for(int i =0;i<1000;i++){
			Date d = new Date();
			d=null;
		}
		System.out.println(r.freeMemory());
		r.gc();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(r.freeMemory());
	}
}
