package name1;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionarrayList {
  public static void main(String args[]){
	  ArrayList<String> arl=new ArrayList<String>();
	  arl.add("Arun");
	  arl.add("sunil");
	  arl.add("vinoth");
	  Iterator<String> itr=arl.iterator();
	  while(itr.hasNext()){
		  System.out.println(itr.next());
	  }
  }
}
