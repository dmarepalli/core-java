package E_5_Enum_Constructor2;

public enum Color {

	BLUE,RED{
		public void info(){
			System.out.println("Dangerous Color");
		}
	},GREEN;
	
	public void info(){
		System.out.println("Universal Color");
	}
	
}
