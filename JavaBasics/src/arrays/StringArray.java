package arrays;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
//takes array name of input and print them on screen
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		String names [] =new String[size];
		
		//taking name as a input
		
		for(int i=0; i<names.length; i++) {
			System.out.println("Enter "+(i+1) +" name");
			names [i]=sc.next();
		}
		
		//printing output
		for (int i=0; i<names.length; i++) {
			System.out.println((i+1)+" "+names[i]);
		}
	}

}
