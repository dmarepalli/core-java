
public class StringDemo1 {

	public static void main(String[] args) {
		String s1 = new String("John");
		s1.concat("Oil");
		s1.concat("Company");
		String s2 = s1.concat("Ltd");
		
		
		/**
		 * 		Heap                   SCP
		 *      ----                  -----
		 *      
		 *      s1->John				John
		 *      
		 *      JohnOil					Oil
		 *      
		 *      JohnCompany				Company
		 *      
		 *      s2->JohnLtd				Ltd
		 * 
		 */
		
	}
}
