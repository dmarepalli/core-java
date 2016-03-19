package G_2_Custom_Type_Class;

public class Gen<T> {

	T ob;
	public Gen(T ob) {
		this.ob = ob;
	}
	
	public void show(){
		System.out.println("Type of ob is: "+ob.getClass().getName());
	}
	
	public T getOb(){
		return ob;
	}
}
