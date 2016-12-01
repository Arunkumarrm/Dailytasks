package name1;

import java.util.ArrayList;
import java.util.Iterator;

public class Testgenericsex1 {
	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();  
		list.add("arunravur");  
		list.add("ashwin");  
		String s=list.get(1);
		System.out.println("name is: "+s);  
		  
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
}
