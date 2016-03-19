
public class SpringDemo4 {

	public static void main(String[] args) {
		String s1 = new String("You can not change me!");
		String s2 = new String("You can not change me!");
		System.out.println(s1==s2);
		String s3 = "You can not change me!";
		String s4 = "You can not change me!";
		System.out.println(s1==s4);
		System.out.println(s1==s3);
		String s5 = "You can not "+"change me!";
		System.out.println(s3==s5);
		String s6 = "You can not ";
		String s7 = s6 +"change me!";
		System.out.println(s3==s7);
		final String s8 ="You can not ";
		String s9 = s8+"change me!";
		System.out.println(s3==s9);
		System.out.println(s6==s8);
			
/**
 * 
 * 		heap						      SCP
 * 		=====						      ===
 * 	
 * 	   s1->YCNCM						YCNCM<- s3,s4,s5,s9
 * 	   s2->YCNCM	
 * 										you can not-<s6,s8
 * 									
 * 										change me
 * 									
 * 		s7-> YCNCM	
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
	}
}
