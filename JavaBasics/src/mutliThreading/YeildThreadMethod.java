package mutliThreading;

public class YeildThreadMethod extends Thread{
	public void run() {
		Thread.yield();
		for (int i=0; i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	public static void main(String[] args) {
		YeildThreadMethod y=new YeildThreadMethod();
		y.start();
		//Thread.yield();
		for (int i=0; i<=5;i++) {	
			System.out.println(Thread.currentThread().getName()+" "+i);

			}
		}

}
