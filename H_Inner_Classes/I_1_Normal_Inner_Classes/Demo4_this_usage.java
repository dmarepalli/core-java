package I_1_Normal_Inner_Classes;

public class Demo4_this_usage {

	int x = 10;
	class inner{
		
		int x =100;
		public void foo(){
			int x = 1000;
			System.out.println(x); //1000
			System.out.println(this.x); // 100
			System.out.println(Demo4_this_usage.this.x); //10
		}
	}
	
	public static void main(String[] args) {
		new Demo4_this_usage().new inner().foo();
	}
}
