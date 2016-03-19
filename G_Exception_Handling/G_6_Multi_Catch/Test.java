package G_6_Multi_Catch;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		try{
			
		}catch(ArithmeticException | NullPointerException ex){
			// This is 1.7v enhancement
		}
	}
}
