package OOPS_3_Automatic_Promotion_In_Overloading_2;

public class Test {

	public void foo(Animal a){
		System.out.println("Animal Version");
	}
	public void foo(Monkey m){
		System.out.println("Monkey Version");
	}
	public static void main(String[] args) {
		Test test = new Test();
		Animal animal = new Animal();
		test.foo(animal); // animal version
		
		Monkey monkey = new Monkey();
		test.foo(monkey); // monkey version
		
		Animal animal2 = new Monkey();
		test.foo(animal2); // animal version
		
		
		/**
		 * In overloading, method resolution always taken care by compiler
		 * based on reference type. (not based on the runtime object)
		 */
	}
	
}
