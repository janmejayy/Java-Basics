package arrays;

public class MultiplyTwoArrays {
	public static void main(String[] args) {
		int a[][]= {{2,3,5},{3,43,0}};
		int b[][]= {{2,53,3},{93,43,4}};
		int c[][]=new int[2][3];
		for (int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				c[i][j]=a[i][j]*b[i][j];
			}}
		for (int i=0;i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				System.out.print(c[i][j]+" ");
			}System.out.println();
		}
		
	}
}
