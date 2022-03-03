package day12.ey;

import java.util.LinkedList;

class Producer1 implements Runnable{
	LinkedList<Integer> list;
	Producer1(LinkedList<Integer> list){
		this.list=list;
	}
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			synchronized(list) {
				System.out.println("Adding to queue- "+Thread.currentThread().getName()+" "+i);
				list.add(i);
			}
		}
		
	}
}

//ConsumerTask
class Consumer implements Runnable{
	LinkedList<Integer> list;
	Consumer(LinkedList<Integer> list){
		this.list=list;
	}
	
	public void run() {
		for(int i=1;i<=5;i++) {
			synchronized(list) {
				System.out.println("Consuming from queue - "+Thread.currentThread().getName()+" "+i);
			}
		}
		
	}
	
	
}

public class Producer {
	public static void main(String[] args) {
		LinkedList<Integer> list1 =new LinkedList<Integer>();
		Thread t1=new Thread(new Producer1(list1),"Producer");
		Thread t2=new Thread(new Consumer(list1),"Consumer");
		t1.start();
		t2.start();

	}

}
