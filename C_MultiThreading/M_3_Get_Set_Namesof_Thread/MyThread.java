package M_3_Get_Set_Namesof_Thread;

public class MyThread extends Thread{

	
	public void run(){
		for(int i = 0;i<10;i++){
			System.out.println("Child Thread");
		}
	}
}
