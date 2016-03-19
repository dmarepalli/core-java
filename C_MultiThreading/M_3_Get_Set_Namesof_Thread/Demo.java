package M_3_Get_Set_Namesof_Thread;

public class Demo {
public static void main(String[] args) {
	System.out.println(Thread.currentThread().getName());
	MyThread t = new MyThread();
	System.out.println(t.getName());
	Thread.currentThread().setName("John");
	System.out.println(Thread.currentThread().getName());
	System.out.println(10/0);
}
}
