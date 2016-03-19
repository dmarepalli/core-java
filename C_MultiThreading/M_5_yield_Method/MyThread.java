package M_5_yield_Method;

public class MyThread extends Thread{

	public void run(){
	for(int i = 0;i<10;i++){
		Thread.yield();
		/**
		 * 1. Above method causes to pause current executing thread to give chance to remaining
		 * waiting threads of same priority.
		 * 2. If there is no waiting thread or all other threads have low priority then
		 * the same thread will continue its execution.
		 * 3. If several waiting threads have same priority then we can not expect which thread
		 * gets chance.
		 * 
		 */
		System.out.println("Child Thread");
	}
	}
}
