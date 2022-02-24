package exceptionHandling;

import java.util.Scanner;

public class TryCatchBlock {
	public static void main(String[] args) {
		int c=10;
		int d=0;
		float f=(float)c/d;
		System.out.println(f);
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the first number :");
			int a=sc.nextInt();
			System.out.println("Enter the Second number :");
		    int b=sc.nextInt();
			//double divide =(double)a/b;
			System.out.println("Your answer is"+" "+a/b);
		}
		catch(Exception e){
			System.out.println("cannot divide by 0");
		}
			
		}
		}