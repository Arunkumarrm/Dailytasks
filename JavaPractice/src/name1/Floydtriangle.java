package name1;

import java.util.Scanner;

public class Floydtriangle {
@SuppressWarnings("resource")
public static void main(String args[]){
	int n, num=1;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number of row's of Floyd's Tringle:");
	n=in.nextInt();
	System.out.println("Floyd's triangle:");
	for(int i=1 ; i<=n ; i++){
		for(int j=1 ; j<=i ; j++){
			System .out.println(num+" ");
			n++;
		}
		System.out.println("\n");
	}
}
}
