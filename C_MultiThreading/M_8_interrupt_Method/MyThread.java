package M_8_interrupt_Method;


public class MyThread extends Thread {

	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("I am a lazy Thread.");
				Thread.sleep(2000);
			}

		} catch (InterruptedException e) {
			System.out.println("I got interrrupted!!");
		}
	}
}
