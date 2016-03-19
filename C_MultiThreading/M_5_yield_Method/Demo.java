package M_5_yield_Method;

public class Demo {
public static void main(String[] args) {
	MyThread t = new MyThread();
	t.start();
	for(int i = 0;i<10;i++){
		System.out.println("main Thread");
	}
}
}
