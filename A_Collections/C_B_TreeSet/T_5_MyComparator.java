package C_B_TreeSet;

import java.util.Comparator;

public class T_5_MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		Integer I1 = (Integer)o1;
		Integer I2 = (Integer)o2;
		
		/*if(I1<I2){
			return +1;
		}else if(I1>I2){
			return -1;
		}else{
		
		
		return 0;
		}*/
		
		//return I1.compareTo(I2); // Default natural sorting
		
		return I2.compareTo(I1); // reverse sorting
		// -return I1.compareTo(I2);
		
		// return +1;  // original insertion order [10,0,15,20,20]
		// return -1; // reverse insertion order [20,20,15,0,10]
		
		// return 0; // [10] only first element will be inserted and 
						// remaining elements are considered as duplicates
						
		
		
	}

}
