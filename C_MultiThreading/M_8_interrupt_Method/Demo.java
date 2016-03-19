package M_8_interrupt_Method;

public class Demo {
	public static void main(String[] args) {

		MyThread t = new MyThread();
		t.start();
		t.interrupt();
		System.out.println("End of main");
	}
}