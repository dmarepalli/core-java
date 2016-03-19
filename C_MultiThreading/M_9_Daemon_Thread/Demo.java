package M_9_Daemon_Thread;

public class Demo {
public static void main(String[] args) {
	MyThread t = new MyThread();
	t.setDaemon(true);
	t.start();
	System.out.println("End of main");
}
/**
 * By default, main thread is non-daemon thread.
 * For remaining threads, daemon nature will be inherited from parent thread.
 * 
 *  
 * Once, the last non-daemon thread terminates, all daemon threads will be nominated. 
 */
}
