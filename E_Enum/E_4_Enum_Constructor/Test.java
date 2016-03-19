package E_4_Enum_Constructor;

public class Test {

	public static void main(String[] args) {
		Beer[] b = Beer.values();
		for(Beer b1: b){
			System.out.println(b1+"..."+b1.getPrice());
		}
	}
}
