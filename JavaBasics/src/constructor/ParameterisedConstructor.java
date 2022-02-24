package constructor;

public class ParameterisedConstructor {
	String name;
	int rollno;
	static String college ="SRM";
	
public ParameterisedConstructor(String name,int rollno){
		name=name;
		rollno=rollno;
		college=college;
		System.out.println(name+" "+rollno+" "+college);
	}

public void metho1() {
	
}

public static void main(String[] args) {
	ParameterisedConstructor obj=new ParameterisedConstructor("jay",233);
	ParameterisedConstructor obj1=new ParameterisedConstructor("janmejay",103);
    
	

}
}
