package mutliThreading;

public class PerformingSingleTaskFromMultipleThread extends Thread {
public void run() {
	System.out.println("single thread created");
}
public static void main(String[] args) {
	PerformingSingleTaskFromMultipleThread th =new PerformingSingleTaskFromMultipleThread();
	th.start();
	PerformingSingleTaskFromMultipleThread th1 =new PerformingSingleTaskFromMultipleThread();
	th1.start();
}
}
