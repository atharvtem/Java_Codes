class myThread extends Thread{
	public void run(){
		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());
	}
}
class ThreadDemo{
	public static void main(String[] args){
		Thread t = Thread.currentThread();
		System.out.println(t.getPriority());
		myThread obj1 = new myThread();
		obj1.start();

		t.setPriority(7);

		myThread obj2 = new myThread();
		obj2.start();
	}
}
