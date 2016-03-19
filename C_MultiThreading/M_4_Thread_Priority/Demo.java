package M_4_Thread_Priority;

public class Demo {
public static void main(String[] args) {
	
	MyThread t = new MyThread();
	System.out.println(t.getPriority());
	t.setPriority(10);
	t.start();
	for(int i = 0;i<10;i++){
		System.out.println("Main Thread");
	}
	System.out.println(Thread.currentThread().getPriority());
}
}
/**
* The valid range of priorities is from 1 to 10.
* 1 is least and 10 is highest priority.
* Default priority for main thread is 5.
* For remaining threads priority is inherited from its parent thread.
*/