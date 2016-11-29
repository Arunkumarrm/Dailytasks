package name1;

public class Varargsexample2 {
	static void display(String...values){
		System.out.println("Arun ravur");
		for(String s:values){
			System.out.println(s);
		}
	}
	public static void main(String args[]){
		display();
		display("hello");
		display("my","age","is","three");
	}

}
