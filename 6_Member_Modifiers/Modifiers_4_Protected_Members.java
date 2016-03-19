
public class Modifiers_4_Protected_Members {
	protected void m1(){
		/**
		 * If a member declared as protected then we can access that member
		 * anywhere with in the package but out side package only child classes
		 * can access.
		 * 
		 * Protected = <default> + kids in other packages
		 */
	}
}

/**
 * With in current package, we can access protected members either by
 * parent reference or by child reference.
 * 
 * But from outside package, we can access protected members only 
 * by using child reference.
 */
