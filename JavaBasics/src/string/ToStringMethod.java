package string;

public class ToStringMethod {
}
class Student{
	String name;
	int roll;
	String company;
   Student(String name,int roll,String company) {
	   this.name=name;
	   this.roll=roll;
	   this.company=company;
   }
   public String toString() {
	   return (roll + " "+name+ " "+company);
   }

	public static void main(String[] args) {
		Student e=new Student("janmejay",233,"TCS");
		System.out.println(e);
		
		
	}

}
