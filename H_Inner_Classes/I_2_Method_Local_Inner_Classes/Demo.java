package I_2_Method_Local_Inner_Classes;

public class Demo {

	public void foo(){
		class Inner{
			public void sum(int x,int y){
				
				System.out.println("Sum is:"+(x+y));
			}
		}
		
		Inner i = new Inner();
		i.sum(10, 20);
		i.sum(10, 1000);
		
	}
	public static void main(String[] args) {
		new Demo().foo();
	}
}
