
public class Constructor_1_Example {

	static int count = 0;
	
	Constructor_1_Example() {
	count++;
	}
	
	Constructor_1_Example(int i){
	count++;
	}
	public static void main(String[] args) {
		Constructor_1_Example constructor_1_Example = new Constructor_1_Example();
		Constructor_1_Example constructor_1_Example2 = new Constructor_1_Example(10);
		System.out.println(count);
	}
	
}
