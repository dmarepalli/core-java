
public class LocalVariableDemo {

	public static void main(String[] args) {
		int i = 0;
		for(int j = 0;j < 3;j++){
			i+=j;
		}
		
		//System.out.println(i+"...."+j); => Can not find symbol. j is local to for loop
		
		
		int y;
		//System.out.println(y); => Compile time error, we should initialize local variables
		// before we use them. No default values are assigned by JVM.
		
		
		
		int z;
		if(args.length>0){
			z = 10;
		}
		//System.out.println(z); => CE: variable z might not have been initialized
		
		
		int a;
		if(args.length>0){
			a=10;
		}else{
			a=20;
		}
		System.out.println(a); // Valid
		
		
		// The only applicable modifier for the local variables is "final"
		
		/* private int b=0; // CE: Illegal Modifier
		   public int b=10;
		   protected int b=10;
		   static int b =10;	
		*/
		
		final int b =10; // valid
		
	}
	
}
