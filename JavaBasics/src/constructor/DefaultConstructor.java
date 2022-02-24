package constructor;

public class DefaultConstructor {
	 String name;
	 int no;
	//also known as no arg contructor
	DefaultConstructor(String name,int no){
		this.name=name;
		this.no=no;
		System.out.println("Created default constructor");
		System.out.println("Default values are: "+name+" "+no);
		
	}
	void normalMethod() {
		System.out.println(name+" "+no);
	}
	public static void main(String[] args) {
		DefaultConstructor obj=new DefaultConstructor("janmejay",233);
		obj.normalMethod();
		

	}
}
	

