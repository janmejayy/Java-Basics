package constructor;

public class ConstructorOverloading {

}
class Sum{
	Sum(int a,int b){
		int sum=a+b;
		System.out.println(sum);}
	
	Sum(int a,int b,int c){
		int sum=a+b+c;
		System.out.println(sum);
	}
	public static void main(String args []) {
		Sum s1=new Sum(5,6);
		Sum s2=new Sum(6,7,4);
		
	}
}