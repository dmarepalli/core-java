package E_5_Enum_Constructor2;

public class Test {
public static void main(String[] args) {
	Color[] c = Color.values();
	for(Color c1:c){
		c1.info();
	}
}
}
