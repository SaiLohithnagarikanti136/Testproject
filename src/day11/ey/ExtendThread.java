package day11.ey;

class TThread extends Thread{
	@Override
	public void run() {
		System.out.println("Executed by a thread= " + Thread.currentThread().getName());
	}
}

public class ExtendThread {

	public static void main(String[] args) {
		System.out.println("In main method- " + Thread.currentThread().getName());
		Thread t1 = new TThread();
		t1.start();
		// Calling start method
		//new Thread().start();
		new TThread().start();
		new TThread().start();
		new TThread().start();

	}

}
