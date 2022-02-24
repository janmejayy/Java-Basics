package mutliThreading;

public class CreatingThreadUsingRunnableInterface implements Runnable{
public void run() {
	System.out.println("Thread is created using Runnable");
}
	
	
public static void main(String[] args) {
	CreatingThreadUsingRunnableInterface cr=new CreatingThreadUsingRunnableInterface();
	Thread t=new Thread(cr);
	t.start();
}
}
