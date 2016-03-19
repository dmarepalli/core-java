package I_4_Anonymous_Inner_Classes_2;

public class Demo {

	public static void main(String[] args) {
		
		Thread t = new Thread(){
			public void run(){
				System.out.println("child thread");
			}
		};
		t.start();
		System.out.println("main thread");
	}
}
