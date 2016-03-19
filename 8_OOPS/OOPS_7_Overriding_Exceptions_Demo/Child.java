package OOPS_7_Overriding_Exceptions_Demo;

import java.io.EOFException;

public class Child extends Parent{
	
	/*public void foo()throws EOFException,InterruptedException{
		//Gives CE
	}*/
	
/**
 * 	Rule: If child class method throws any checked exception, then
 * compulsory parent class method throw the same checked exception
 * or its parent.
 * 
 * This rule is not applicable for unchecked exceptions.
 * 
 * 
 * Case 1: Valid
 * 
 * Parent: public void foo() throws Exception
 * Child : public void foo()
 * 
 * 
 * Case 2: Invalid
 * 
 * Parent: public void foo()
 * Child : public void foo() throws Exception
 *  
 *  
 * Case 3: Valid
 * 
 * Parent: public void foo() throws Exception
 * Child : public void foo() throws IOException
 * 
 * 
 * Case 4: Invalid
 * 
 * Parent: public void foo() throws IOException
 * Child : public void foo() throws Exception
 * 
 * 
 * Case 5: Valid
 * 
 * Parent: public void foo() throws IOException
 * Child : public void foo() throws FileNotFoundException,InterruptedException
 * 
 * 
 * Case 6: Invalid
 * 
 * Parent: public void foo() throws IOException
 * Child : public void foo() throws EOFException,InterruptedException
 * 
 * 
 * Case 7: Valid
 * 
 * Parent: public void foo() throws IOException
 * Child : public void foo() throws ArithmeticException,NullPointerException,ClassCastException
 * 
 * 
 *	
 */

}
