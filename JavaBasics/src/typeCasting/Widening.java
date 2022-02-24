package typeCasting;

public class Widening {
//Converting a lower data type into a higher one is called widening type casting.
//it is done automatically
//byte <short<char<int<long<float<double
	public static void main(String[] args) {
byte y=10;
short x=y;
int a=x;
long b=a;
float c=b;
double d=c;
System.out.println(y);
System.out.println(x);
System.out.println(a);
System.out.println(b);
System.out.println(c);
System.out.println(d);



	}

}
