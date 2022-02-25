package constructor;

public class DefaultConstructor {
	 static String name;
	 int no;
	//also known as no arg contructor
	DefaultConstructor(){
		name="jay";
	     
		no=91;
		System.out.println("Created default constructor");
		System.out.println("Default values are: "+name+" "+no);
		
	}
	void normalMethod() {
		System.out.println(name+" "+no);
	}
	public static void main(String[] args) {
		DefaultConstructor obj=new DefaultConstructor();
		obj.normalMethod();
		

	}
}
	

