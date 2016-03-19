
public class Array_4_AnonymousArrays {
public static void main(String[] args) {
	// Arrays with out a name. Used for insrant use.
	sum(new int[]{10,20,30});
}

private static void sum(int[] is) {
	
	int total=0;
	for(int i:is){
		total += i;
	}
	System.out.println(total);
}
}
