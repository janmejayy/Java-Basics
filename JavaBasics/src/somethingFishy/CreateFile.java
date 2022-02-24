package somethingFishy;

import java.io.File;
import java.io.FileOutputStream;
//Importing the IOException class for handling errors  
import java.io.IOException;
import java.util.Scanner;   
class CreateFile {  
	public static void main(String args[]) {
	    try {
	      Scanner sc = new Scanner(System. in ); //object of Scanner class  
	      System.out.println("Enter the file name with specific location: ");
	      String name = sc.nextLine(); //variable name to store the file name 
	      FileOutputStream fos = new FileOutputStream("main"+name, true);
	      // true for append mode  
	      System.out.println("Enter file content: ");
	      String str = sc.nextLine() + "\n";
	      //str stores the string which we have entered  
	      byte[] b = str.getBytes(); //converts string into bytes  
	      fos.write(b); //writes bytes into file  
	      fos.close(); //close the file  
	      System.out.println("The file has been saved on the given path.");
	    }
	    catch(Exception e) {
	      System.out.println("Exception Occurred:");
	      e.printStackTrace();
	    }
	  }}