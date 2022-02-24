package mutliThreading;

public class JoinMethod extends Thread{

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
	
public static void main(String[] args) throws InterruptedException {
	JoinMethod s=new JoinMethod();
	s.start();
	s.join();//this thread will wait to complete previous thread to complete its task
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
