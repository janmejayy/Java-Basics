package mutliThreading;

public class DaemonThreads extends Thread{
	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("Deamon thread working ");
		}else {
			System.out.println("user thread working");
		}
	}
	public static void main(String[] args) {
		DaemonThreads d=new DaemonThreads();
		DaemonThreads d1=new DaemonThreads();
		DaemonThreads d2=new DaemonThreads();

		d.setDaemon(true);//always set daemon thread before start method
		d.start();
		d1.start();
		d2.start();
	}

}
