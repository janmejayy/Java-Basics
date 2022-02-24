package string;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you name to check palindrome");
		String name=sc.nextLine();
		StringBuffer sb=new StringBuffer(name);
		StringBuffer rev=sb.reverse();
		String name1=new String(rev);

		
		if(name.equals(name1)) {
               System.out.println("true");			
		}else {
			System.out.println("false");
		}
			
		}
		
	}


