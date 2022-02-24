package string;

public class ReverseString {
public static void main(String[] args) {
	String s="janmejay";
	int value=s.length();
	char [] c=s.toCharArray();
	String rev="";
	for (int i=value-1; i>=0; i--) {
		rev=rev+c[i];
	}System.out.println(rev);
}
}
