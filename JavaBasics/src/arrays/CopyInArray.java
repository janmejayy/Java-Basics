package arrays;

import java.util.Arrays;

public class CopyInArray {
	public static void main(String[] args) {  
        //declaring a source array  
        String[] arr = { "hello","how","are","you","I","am","glad","you","like","it" };  
        //declaring a destination array  
        String [] s = new String[6];  
        //copying array using System.arraycopy() method  
       System.arraycopy(arr,4,s,0,6);  
        //printing the destination array  
        //System.out.println(String.valueOf(s)); 
        System.out.println(Arrays.toString(s));
    }  
}
