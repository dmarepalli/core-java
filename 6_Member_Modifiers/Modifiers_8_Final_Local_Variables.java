
public class Modifiers_8_Final_Local_Variables {
public static void main(String[] args) {
	final int x;
	System.out.println("Hello"); // This is fine
	x=10;
	System.out.println(x); // We should initialize final local variable
						   // before using it
}
}
