package constructor;

public class CopyConstructor {
String s;
int no;
CopyConstructor(String name,int num){
s=name;
no=num;
//System.out.println(s +" "+no);
}
CopyConstructor(CopyConstructor n){
 s=n.s;
 no=n.no;
 //System.out.println(s +" "+no);
}
void display() {
	 System.out.println(s +" "+no);

}
public static void main(String[] args){
	CopyConstructor obj=new CopyConstructor("jay",233);
	CopyConstructor obj1=new CopyConstructor(obj);
obj.display();
obj1.display();
}
}
