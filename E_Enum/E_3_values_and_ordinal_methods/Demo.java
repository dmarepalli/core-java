package E_3_values_and_ordinal_methods;

public class Demo {
public static void main(String[] args) {
	Beer[] b = Beer.values();
	for(Beer b1:b){
		System.out.println(b1+"...."+b1.ordinal());
	}
}
}
