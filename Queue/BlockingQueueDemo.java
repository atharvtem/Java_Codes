import java.util.concurrent.*;

class BlockingQueueDemo{
	public static void main(String [] args)throws InterruptedException{
		BlockingQueue bq = new ArrayBlockingQueue(3);
		bq.offer(10);
		bq.offer(20);
		bq.offer(30);
		System.out.println(bq);
		bq.put(40);			//put method throws InterrupedException. if you have to use it, you have to throw it
		System.out.println(bq);
		//if we overload BlockingQueue using offer method,it neither will throw exception,nor will add element, it'll just skip the statement 
		//and move on
	}
}
