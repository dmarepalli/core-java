
public class Constructor_2_Singleton {

	
	private static Constructor_2_Singleton t;
	
	private Constructor_2_Singleton(){
		
	}
	
	public Constructor_2_Singleton getInstance(){
		if(t == null){
			return new Constructor_2_Singleton();
		}else{
			return t;
		}
	}
	
	public Object clone(){
		return this;
	}
}
