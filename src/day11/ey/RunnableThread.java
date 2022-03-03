package day11.ey;

class threads  implements Runnable{
	@Override
	public void run() {
		System.out.println("In run method- " + Thread.currentThread().getName());
	}
}

public class RunnableThread {

	public static void main(String[] args) {
		Thread t1 = new Thread(new threads());
		t1.start();
		
		Thread t2 = new Thread(new threads(), "MyThread");
		t2.start();
		
		Thread t3 = new Thread(new threads(), "My thread1");
		t3.start();

	}

}
