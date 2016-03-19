package G_4_throws;

public class Demo {
public static void main(String[] args) throws InterruptedException {
	/**
	 * In our code if there is a chance of raising checked exception then, we should handle it
	 * by using try-catch or throws.
	 * 
	 * we can use throws to delegate responsibility of exception handling to the caller. Then
	 * the caller method is responsible to handle that exception.
	 */
	
	doStuff();
}

private static void doStuff() throws InterruptedException {
	doMoreStuff();
	
}

private static void doMoreStuff() throws InterruptedException {
	
	Thread.sleep(1000);
	
}
}
