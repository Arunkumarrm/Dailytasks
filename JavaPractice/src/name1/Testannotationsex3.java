package name1;

public class Testannotationsex3 {
	void m(){System.out.println("hello m");}  
	  
	@Deprecated  
	void n(){System.out.println("hello n");}  
	}  
	  
	class TestAnnotation3{  
	public static void main(String args[]){  
	  
		Testannotationsex3 a=new Testannotationsex3();  
	a.n();  
	}

}
