package I_4_Anonymous_Inner_Classes_2;

public class Demo3 {

	public static void main(String[] args) {
		new Thread(new Runnable(){
			
			public void run(){
				System.out.println("child thread");
			}
		}).start();
		System.out.println("main thread");
	}
}
