package C_B_TreeSet;

public class T_C_Employee implements Comparable{

	String name;
	int eid;
	public T_C_Employee(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}

	public String toString(){
		
		return name+"__"+eid;
	}
	
	@Override
	public int compareTo(Object o) {
		
		int eid1 = this.eid;
		T_C_Employee e = (T_C_Employee)o;
		
		int eid2= e.eid;
		if(eid1<eid2){
			 return -1;
		}else if(eid1>eid2){
			return +1;
		}else{
			return 0;
		}
		
	}

	
	
}
