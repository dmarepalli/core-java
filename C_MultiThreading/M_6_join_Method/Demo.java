package M_6_join_Method;

import M_5_yield_Method.MyThread;

public class Demo {
public static void main(String[] args) {
	MyThread t = new MyThread();
	t.start();
	try {
		t.join();
		/**
		 * 1. If a thread wants to wait until completion of some other thread
		 * we can use join()
		 * 2. If a thread t1 wants to wait until completion of t2 then
		 * t1 thread has to call t2.join() then immediately t1 goes to waiting state
		 * 
		 */
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	for(int i = 0;i<10;i++){
		System.out.println("main Thread");
	}
}
}
