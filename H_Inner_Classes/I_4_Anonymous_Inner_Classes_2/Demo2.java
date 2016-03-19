package I_4_Anonymous_Inner_Classes_2;


/** anonymous class that implements interface*/
public class Demo2 {

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Child Thread");
				
			}
		};
		System.out.println("main thread");
	}
}
