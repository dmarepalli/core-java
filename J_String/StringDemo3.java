
public class StringDemo3 {
public static void main(String[] args) {
	String s1 = "Spring";
	String s2 = s1+"Summer";
	s1.concat("fall");
	s2.concat(s1);
	s1+="winter";
	System.out.println(s1);
	System.out.println(s2);
	
	/**
	 * 		heap				SCP
	 * 		====				====
	 * 
	 * 							Spring <- s1
	 * 							
	 * 							Summer
	 * 	
	 * 	s2->SpringSummer		
	 * 							fall
	 * 	
	 * Springfall
	 * 
	 * SpringfallSpring
	 * 
	 * 							winter
	 * 
	 * 
	 * s1->springwinter
	 * 
	 * 
	 */
}
}
