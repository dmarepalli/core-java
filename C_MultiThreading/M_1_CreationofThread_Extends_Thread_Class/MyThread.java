package M_1_CreationofThread_Extends_Thread_Class;

public class MyThread extends Thread{

	
	public void run(){ // job of thread
		for(int i = 0;i<10;i++){
			System.out.println("Child Thread");
		}
	}
	
	/**
	 * If we do not override run(), then Thread class run() will be executed which is
	 * empty implementation.
	 */
	
}
