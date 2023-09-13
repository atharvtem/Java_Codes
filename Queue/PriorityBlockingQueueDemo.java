import java.util.concurrent.*;

class PriorityBlockingQueueDemo{
	public static void main(String [] args)throws InterruptedException{
		PriorityBlockingQueue bq = new PriorityBlockingQueue(3);
		for(int i=1;i<=15;i++){
			bq.put(i);
			System.out.println("Item added: "+ i);
		}
		System.out.println(bq);
		System.out.println(bq.remainingcapacity());
	}
}
