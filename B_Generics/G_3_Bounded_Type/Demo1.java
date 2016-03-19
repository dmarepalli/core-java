package G_3_Bounded_Type;

public class Demo1<T extends Number> {

	public static void main(String[] args) {
		Demo1<Integer> i = new Demo1<Integer>();
		Demo1<Double> d = new Demo1<Double>();
		//Gen<String> s = new Gen<String>();
	}
}
