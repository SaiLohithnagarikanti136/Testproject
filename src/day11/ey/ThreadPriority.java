package day11.ey;

class NumThread implements Runnable{
	@Override
	public void run() {
		System.out.println("priority of " + Thread.currentThread().getName() + " is " + Thread.currentThread().getName());
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
}
public class ThreadPriority {

	public static void main(String[] args) {
		Thread t1 = new Thread(new NumThread(), "thread-1");
		Thread t2 = new Thread(new NumThread(), "thread-2");
		Thread t3 = new Thread(new NumThread(), "thread-3");
		Thread t4 = new Thread(new NumThread(), "thread-4");
		
		System.out.println("Original priority of thread-1: " + t1.getPriority());
		System.out.println("Original priority of thread-2: " + t2.getPriority());
		System.out.println("Original priority of thread-3: " + t3.getPriority());
		System.out.println("Original priority of thread-4: " + t4.getPriority());
		
		t2.setPriority(7);
		t3.setPriority(Thread.MAX_PRIORITY);
		t4.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Start after 4 threads have finished");
	}

}
