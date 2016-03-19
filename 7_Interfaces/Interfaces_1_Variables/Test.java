package Interfaces_1_Variables;
public class Test implements Interf{
public static void main(String[] args) {
	//x=888; CE: we can not modify interface variables
	System.out.println(x);
	int x=90;
	System.out.println(x);
}
}
