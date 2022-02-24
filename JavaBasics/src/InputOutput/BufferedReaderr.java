package InputOutput;
import java.lang.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderr {
	public static void main(String[] args) throws IOException  {
		
	
	//For Example: Suppose we want to read an integer from the user then the code will look like:

		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 int a= Integer.parseInt(reader.readLine());
		 int b= Integer.parseInt(reader.readLine());

		 System.out.println(a+" "+b);
		// System.out.println(b);

//		Another Example: Suppose we want to read a line (in form of a string) from the user then the code will look like:

		// BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 //String toRead1= reader.readLine();
		
		
}
}