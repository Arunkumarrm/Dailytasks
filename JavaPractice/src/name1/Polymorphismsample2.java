package name1;

public class Polymorphismsample2 extends Polymorphismsample {
	void run(){
		System.out.println("this is the result for run method in Polymorphismsample2 class");
	}
public static void main(String args[]){
	Polymorphismsample p= new Polymorphismsample2();
	p.run();
	
}
}
