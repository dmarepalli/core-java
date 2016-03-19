package G_2_Custom_Type_Class;

public class Demo {
public static void main(String[] args) {
	Gen<String> g = new Gen<String>("John");
	g.show();
	System.out.println(g.getOb());
	
	Gen<Integer> i = new Gen<Integer>(10);
	i.show();
	System.out.println(i.getOb());
	
}
}
