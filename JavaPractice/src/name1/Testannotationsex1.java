package name1;
class Testannotationsex1 {
	void eatSomething(){
		System.out.println("eating something");
		}

	
	}                        //This program is an Example for @override methodS
	  
	class Dog extends Testannotationsex1{
		
	@Override  
	void eatSomething(){
		System.out.println("eating foods");
		}  
	}  
	  
	class TestAnnotation1{  
	public static void main(String args[]){  
		Testannotationsex1 j=new Dog();  
	    j.eatSomething();  
	}
}