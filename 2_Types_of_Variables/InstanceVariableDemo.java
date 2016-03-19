
public class InstanceVariableDemo {
	String s;
	int x;
	boolean b;
public static void main(String[] args) {
	InstanceVariableDemo demo = new InstanceVariableDemo();
	System.out.println(demo.s); //null
	System.out.println(demo.x); // 0
	System.out.println(demo.b); // false
}
}
