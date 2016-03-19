package E_2_Enum_Switch_Demo;

import E_1_Demo.Beer;

public class Demo {
	public static void main(String[] args) {
		Beer b = Beer.RC;

		switch (b) {

		case KF:
			System.out.println("KF");
			break;
		case KO:
			System.out.println("KF");
			break;
		case RC:
			System.out.println("KF");
			break;
		case FO:
			System.out.println("KF");
			break;
		default:
			System.out.println("default");
		}
	}

}
