import java.util.concurrent.*;

class LinkedBlockingQueueDemo{
	public static void main(String [] args)throws InterruptedException{
		LinkedBlockingQueue LQ = new LinkedBlockingQueue(3);
		LQ.put(10);
		LQ.put(20);
		LQ.put(30);
		System.out.println(LQ);
		LQ.offer(40,3,TimeUnit.SECONDS); 	//this also works in LinkedBlockingQueue
		System.out.println(LQ);
	}
}
