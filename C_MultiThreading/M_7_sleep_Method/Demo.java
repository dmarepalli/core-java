package M_7_sleep_Method;



public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		for(int i = 0;i<10;i++){
			System.out.println("i");
			Thread.sleep(1000);
			/**
			 * If we do not want to let a thread run for particular amount of time
			 * then we can use sleep method 
			 */
		}
	}
}
