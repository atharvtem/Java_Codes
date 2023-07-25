class myThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread());
	}
}
class ThreadDemo{
	public static void main(String [] args)throws InterruptedException{
		System.out.println(Thread.currentThread());

		myThread obj = new myThread();
		obj.start();

		Thread.sleep(100);
		//if we do not put delay using sleep, thread main has great priority hence it will print below code many times(most times)
		//to print thread atharv at last, we have set delay
		Thread.currentThread().setName("Atharv");
		System.out.println(Thread.currentThread());
	}
}
