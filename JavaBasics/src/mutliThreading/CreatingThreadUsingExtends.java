package mutliThreading;

public class CreatingThreadUsingExtends extends Thread{
	@Override
public void run() {
		while(true) {
	System.out.println("Thread is running using extends keyword");
	
		}
}
	
	
	
	public static void main(String[] args) {
		CreatingThreadUsingExtends t=new CreatingThreadUsingExtends();
		t.start();
	}
}
