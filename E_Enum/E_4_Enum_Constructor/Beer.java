package E_4_Enum_Constructor;

public enum Beer {

	KF(75),KO(90),RC(70),FO;
	
	int price;
	
	Beer(int price){
		this.price = price;
	}
	Beer(){
		this.price = 65;
	}
	
	public int getPrice(){
		return price;
	}
	
}
