package DataTypes;

import java.util.Scanner;

public class problem1 {


public static void main(String []argh)
{
//	Sample Input
//
//	5
//	-150
//	150000
//	1500000000
//	213333333333333333333333333333333333
//	-100000000000000


    Scanner sc = new Scanner(System.in);
    int T=sc.nextInt();

    for(int i=0;i<T;i++)
    {

        try
      {
        long x=sc.nextLong();
            System.out.println(x+" can be fitted in:");
            if(x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE)
                System.out.println("* byte");
            if(x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)
                System.out.println("* short");
            if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE)
                System.out.println("* int");
            if(x>=Long.MIN_VALUE && x<=Long.MAX_VALUE)
                System.out.println("* long");
    }
        catch(Exception e)
        {
            System.out.println(sc.next()+" can't be fitted anywhere.");
        }

    }
}
}
