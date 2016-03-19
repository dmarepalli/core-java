package I_3_Anonymous_Inner_Classes_1;

public class Test {
public static void main(String[] args) {
	Popcorn p = new Popcorn(){
		public void taste(){
			System.out.println("Sweet");
		}
	};
	/**
	 * Here we are creating a new anonymous class which extends Popcorn and we are 
	 * creating object for that class using parent class reference(Popcorn)
	 */
	p.taste();
	
	Popcorn p1 = new Popcorn();
	p1.taste();
}
}
