import static java.lang.Integer.MAX_VALUE;
import static java.lang.Byte.*;

public class Static_3_Ambiguity_Precedence {
	public static void main(String[] args) {
		System.out.println(MAX_VALUE); // explicit import have the precedence
	}
}
