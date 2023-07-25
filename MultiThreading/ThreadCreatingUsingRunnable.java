class myThread implements Runnable{
	public void run(){
		System.out.println("In run"+ Thread.currentThread().getName());
	}
	public static void main(String [] args){
		myThread obj = new myThread();
		Thread t = new Thread(obj);
		t.start();
		System.out.println(Thread.currentThread().getName());
	}
}
