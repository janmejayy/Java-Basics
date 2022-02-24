package mutliThreading;

class PerformingMultipleTaskFromMultipleThread extends Thread{
public void run() {
	//while(true) {
	System.out.println("playing music");
	
	//}
}
}
class Thread2 extends Thread{
	public void run() {
		//while(true) {
		System.out.println("downloading file");
		
		//}
	}
	}
class Thread3 extends Thread{
	public void run() {
		//while(true) {
			System.out.println("writing someting");
			//}
		}
		}
 class MainThread{
		public static void main(String[] args) {
			PerformingMultipleTaskFromMultipleThread th=new PerformingMultipleTaskFromMultipleThread();
			th.start();
			 System.out.println(th.isAlive());
	
			Thread2 t2=new Thread2 ();
			t2.start();
			Thread3 t3=new Thread3();
			t3.start();
			System.out.println(th.isAlive());
		}	}
