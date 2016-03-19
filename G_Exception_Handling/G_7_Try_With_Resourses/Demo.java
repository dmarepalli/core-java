package G_7_Try_With_Resourses;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo {
public static void main(String[] args) {
	/**
	 * Main advantage of try with resources is, the resources which are opened in try block
	 * will be closed automatically once control reaches end of try block.
	 * 
	 * So there is no need of finally block.
	 */
	try(BufferedReader br = new BufferedReader(new FileReader("input.txt"))){
		
		/**
		 * We can declare any number of resources separated by semi colon.
		 * 
		 * The resource references are implicitly final.
		 * 
		 * The resources should be auto closable. Means corresponding class should implement
		 * java.lang.AutoClosable
		 */
		
	}catch(IOException e){
		
	}
}
}
