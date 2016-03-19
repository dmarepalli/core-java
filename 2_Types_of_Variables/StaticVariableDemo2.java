
public class StaticVariableDemo2 {

	int x = 10;
	static int y = 20;
	public static void main(String[] args) {
		StaticVariableDemo2 demo = new StaticVariableDemo2();
		demo.x=888;
		demo.y=999;
		StaticVariableDemo2 demo2 = new StaticVariableDemo2();
		System.out.println(demo.x); //10
		System.out.println(demo.y); //999
	}
}
