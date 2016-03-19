package E_1_Demo;

public enum Beer {

	KF,KO,RC,FO; // semi colon is optional
	
	/**
	 * Enum concept is internally implemented using class concept
	 * 
	 * Every enum constant is a reference variable to enum type object
	 * 
	 * Every enum constant is always public static final 
	 * 
	 * This enum will be internally represented as
	 * 
	 * class Beer{
	 * 	public static final Beer KF = new Beer();
	 * 	public static final Beer KO = new Beer();
	 * 	public static final Beer RC = new Beer();
	 * 	public static final Beer FO = new Beer();
	 * }
	 * 
	 */
}
