package mutliThreading;

public class ThreadMethods implements Runnable {
	public void run() {
		System.out.println("thread task"+" "+Thread.currentThread().getName());
	}
public static void main(String[] args) {
	ThreadMethods t=new ThreadMethods();
	Thread t1=new Thread(t);
	t1.start();
	//1.Basic methods
	//public void run(){};
	//public synchronized void start(){};
	//public static native Thread currentThread();
	//public final native boolean is alive();
	
	System.out.println(Thread.currentThread().getName());
	Thread.currentThread().setName("JANMEJAY");
	System.out.println(Thread.currentThread().getState());
	System.out.println(Thread.currentThread().getName());
	//2.naming methods
	//public final String getName() {};
	//public final synchronized void setName(String name) {};

	//3.Daemon thread
	//public final boolean isDaemon(boolean on){};
	//public final void setDaemon(boolean on){};
	
	//4.priority methods
	//public final int getPriority(){};
	//public final void setPriority(int newPriority){}
	
    //5.prevent thread execution 
	//public static native void sleep(long millis) throws InterruptedException;
	//public static native void yield();
	//public final join() throws InterruptedExecption{};
	//depricated methods 
	//public final void suspend(){}
	//public final void resume(){}
	//public final void stop(){}
	//public void destroy(){}
	
	
    //6.Interrupting a thread methods
	//public void interrupt(){}
	//public boolean isInterrupted{}
	//public static boolean interrupted(){}
	
     
	//7.inter-thread communication methods
	//public final void wait () throws InterruptedExecption{}
	//public final native void notify();
	//public final native void notifyAll();



}
}
