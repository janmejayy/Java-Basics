package arrays;

public class PassingArrayToMethod {
public static void main(String[] args) {
	int arr[]= {10,2,4,5,7};
	min(arr);
}

private static void min(int [] arr) {
	int min=arr[0];
	for(int i=0;i<arr.length; i++) 
		if(min>arr[i]) 
			min=arr[i];
		
	System.out.println(min);
	
}
}
