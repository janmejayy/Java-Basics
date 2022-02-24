package mutliThreading;

public class SleepMethod extends Thread{
	public void run() {
		try {
				for(int i=0; i<=5; i++) {
					System.out.println(Thread.currentThread().getName()+" ");
				Thread.sleep(1000);
			}
				}
				catch (InterruptedException e) {
			
			}
		}
	
public static void main(String[] args) {
	SleepMethod s=new SleepMethod();
	s.start();
	try {
		for(int i=0; i<=5; i++) {
			System.out.println(Thread.currentThread().getName()+" ");
		Thread.sleep(1000);
	}
		}
		catch (InterruptedException e) {
	
	}
}
	
}

