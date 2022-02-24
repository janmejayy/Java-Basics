package InputOutput;

import java.util.Scanner;

public class JavaEndofFile {
	public static void main(String[] args) {
//		Sample Input
//      Hello world
//		I am a file
//		Read me until end-of-file.
		
//		Sample Output
//      1 Hello world
//		2 I am a file
//		3 Read me until end-of-file.
       
        Scanner sc=new Scanner(System.in);
        for(int i=1; sc.hasNext()==true; i++){
        
        System.out.println(i +" "+sc.nextLine());
        }
    }
}
