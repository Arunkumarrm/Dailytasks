package name1;

public class Throwone {
static void validate (int age){
	if(age<21)
		throw new ArithmeticException("Not valid for licence");
	else
		System.out.println("welcome to RTO Office");
}
public static void main (String args[]){
	validate (17);
	System.out.println("RESET THE FORM.");
}
}
