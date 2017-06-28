package name1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistExample {
	public static void main(String args[]){
		LinkedList<String> l=new LinkedList<String>();
		l.add("Arunkumar");
		l.add("Dinesh.s");
		l.add("Dinesh.l");
		l.add("velayudham");
		Iterator<String> itr=l.iterator();
		while(itr.hasNext()){  
			   System.out.println(itr.next());
	}
	
	}
}
