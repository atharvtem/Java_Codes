import java.util.*;
import java.util.concurrent.*;

class ArrayBlockingQueueDemo{
	public static void main(String [] args)throws InterruptedException{
		BlockingQueue bq = new ArrayBlockingQueue(3);
		bq.put(10);
		bq.put(20);
		bq.put(30);
		System.out.println(bq);
		bq.offer(40,5,TimeUnit.SECONDS);
		System.out.println(bq);

		ArrayList al = new ArrayList();
		System.out.println("ArrayList: "+ al);
		bq.drainTo(al);
		System.out.println("ArrayLsit: "+ al);
		System.out.println(bq);
	}
}
