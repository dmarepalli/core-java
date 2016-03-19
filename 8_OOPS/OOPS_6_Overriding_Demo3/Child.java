package OOPS_6_Overriding_Demo3;

public class Child extends Parent{

	/*protected void foo(){ //-> Compile Time Error
		
	}*/
	/**
	 * Cannot reduce the visibility of the inherited method from Parent
	 * While overloading, the scope of access modifier can not be reduced.
	 * we can increase the scope.
	 */
}

/**
 * Parent method      Public	Protected	default	    Private
 * 
 * 
 * Child method       public	protected/   default/	can not be overriden
 * 								public       protected/
 * 											 public
 * 								
 */
