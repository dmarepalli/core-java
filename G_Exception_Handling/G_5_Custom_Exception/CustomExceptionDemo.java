package G_5_Custom_Exception;

public class CustomExceptionDemo {
public static void main(String[] args) {
	int age = Integer.parseInt(args[0]);
	if(age>60){
		throw new TooOldException("you are too old for this!");
	}else if(age<18){
		throw new TooYoungException("You are too young for this!");
	}else{
		System.out.println("Get ready! you are selected");
	}
}
}
