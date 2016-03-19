package O_1_equals_Method;

public class Student1 {

	String name;
	int rollno;
	Student1(String name,int rollno){
		this.name = name;
		this.rollno = rollno;
	}
	public static void main(String[] args) {
		Student1 s1 = new Student1("John",101);
		Student1 s2 = new Student1("Bob",102);
		Student1 s3 = new Student1("John",101);
		Student1 s4 = s1;
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals("John"));
		System.out.println(s1.equals(null));
		
		
	}
	
	public boolean equals(Object o){
		try{
			String name1 = this.name;
			int rollno1 = this.rollno;
			
			Student1 s2 = (Student1)o;
			String name2 = s2.name;
			int rollno2 = s2.rollno;
			
			if(name1.equals(name2) && rollno1 == rollno2){
				return true;
			}else{
				return false;
			}
		}catch(ClassCastException e){
			return false;
		}catch(NullPointerException e){
			return false;
		}
	}

	
}
