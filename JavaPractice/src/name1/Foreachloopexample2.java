package name1;

import java.util.ArrayList;

public class Foreachloopexample2 {
	public static void main(String args[])
	{
		ArrayList<String> List=new ArrayList<String>();
		List.add("Arun");
		List.add("sunil");
		List.add("ravi");
		for(String s:List)
		{
			System.out.println(s);
		}
		
	}

}
