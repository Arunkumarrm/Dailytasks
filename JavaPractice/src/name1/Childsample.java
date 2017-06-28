package name1;

public class Childsample extends Inheritancesample {
	public void childmethod(){
		System.out.println("this is single inheritance");
	}
	public void hai(){
		System.out.println("this is not from inheritance sample");
	}
    public static void main(String[] args){
    	Childsample c =new Childsample();
    	c.childmethod();
    	c.hai();
    	Inheritancesample i =new Inheritancesample();
    	i.hello();
    	i.hai();
    	
    }
}
