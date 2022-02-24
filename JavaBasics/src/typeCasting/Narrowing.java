package typeCasting;

public class Narrowing {
//byte < short < char< int <long < float <double
//Converting a higher data type into a lower one is called narrowing type casting.
//It is also known as explicit conversion or casting up. 
//It is done manually by the programmer
	public static void main(String[] args) {
		byte a=(byte)100.00000;
		short b=(short)10000.00000;
		int c=(int)(1000000.00000);
		long d=(long)1000000.00000;
		float e=(float)(1000000.00000);
		double f=(double)1000000.00000d;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

	}

}
