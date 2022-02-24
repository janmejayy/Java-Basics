package arrays;

import java.util.Scanner;

public class CompareTwoArray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] arr=new int[3];
	int[] arr2=new int[3];
	for (int i=0;i<3;i++) {
		arr[i]=sc.nextInt();
	}
	for (int i=0;i<3;i++) {
		arr2[i]=sc.nextInt();
	}
	int count=0;
	int count1=0;
	for (int i=0;i<arr.length; i++) {
		if(arr[i]>arr2[i]) {
			count++;
		}
		else if(arr[i]<arr2[i]) {
			count1++;
		}
	}System.out.println(count+" "+count1);
}
}
