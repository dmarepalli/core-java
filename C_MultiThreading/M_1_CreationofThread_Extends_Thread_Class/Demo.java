package M_1_CreationofThread_Extends_Thread_Class;

public class Demo {
public static void main(String[] args) {
	MyThread t = new MyThread(); // instantiating thread
	t.start(); // starting a thread
	/**
	 * Body of start() contains following
	 * 1. Register this thread with ThreadScheduler
	 * 2. Perform all required activities
	 * 3. invoke run() method
	 * 
	 */
	
	//t.start(); If we try to start already started thread => IllegalThreadStateException
	
	for(int i = 0;i<10;i++){
		System.out.println("Main Thread");
	}
	
}
}
