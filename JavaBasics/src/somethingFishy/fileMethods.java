package somethingFishy;

import java.io.File;

public class fileMethods {
	public void file() {
		int count=0;
		File f=new File("C:\\Program Files");
		String [] s=f.list();
        for(String s1:s) {
			count++;               //if we want to print all files and folder use this method
			System.out.println(s1); }
	}
public static void main(String[] args) {
	fileMethods f=new fileMethods();
	f.file();
	
}
}
