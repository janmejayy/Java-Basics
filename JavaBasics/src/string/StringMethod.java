package string;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
         String s1="janmejay.yadav";
         String s2="Janmejay yadav";
         String s3="733.93773733";
         System.out.println(s1);
         
         //methods in string
        
         System.out.println(s1.charAt(5));
         System.out.println(s1.length());
         System.out.println(s1.compareTo(s2));
         System.out.println(s1.compareToIgnoreCase(s2));
         System.out.println(s1.codePointAt(2));
         System.out.println(s1.concat(s2));
         System.out.println(String.format("round off to decimal point %f",733.93773733 ));
        // System.out.println(String.format("round off to two decimal point %0.2f",733.93773733 ));
         String []str=s1.split("\\.");
         System.out.println(Arrays.toString(str));
         System.out.println( s1.equals(str));
         
         for(String arr:s1.split("\\s",1)) {
         System.out.println(arr);
        }
        
	}

}
