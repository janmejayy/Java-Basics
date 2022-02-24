package mutliThreading;

class ThreadPriority extends Thread{
	public void run() {
		while(true) {
		System.out.println("thread 1 is executing");
		
	}}}
class B extends Thread{
	public void run() {
		while(true) {
		System.out.println("thread 2 is executing");
	}
	}}
class C extends Thread{
	public void run() {
		while(true) {
		System.out.println("thread 3 is executing");
	}}
	
}
class MainPriorityThread{
	public static void main(String[] args) {
		ThreadPriority p1=new ThreadPriority();
		B p2=new B();
		C p3=new C();
		p1.setPriority(10);
		p2.setPriority(1);
		p3.setPriority(5);
		p1.start();
		p2.start();
		p3.start();


	}
}
