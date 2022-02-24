package loops;

import java.util.Scanner;

public class PrintTable {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	for (int i=1;i<=10;i++) {
		//System.out.println(a+" × "+i+" = "+a*i);
		System.out.printf("%d x %d = %d\n", a, i, a*i);//FOR ASCII VALUE using printf
	}
}
}
