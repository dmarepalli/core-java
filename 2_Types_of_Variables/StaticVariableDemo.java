
public class StaticVariableDemo {
	static int i =10;
	static int j;
	public static void main(String[] args) {
		System.out.println(j);
		System.out.println(StaticVariableDemo.i);
		System.out.println(i);
		
		StaticVariableDemo demo = new StaticVariableDemo();
		demo.m1();
		System.out.println(demo.i);
	}
	private void m1() {
		
		System.out.println(i);
		
	}
	
	
}
