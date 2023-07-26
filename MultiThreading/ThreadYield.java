class myThread extends Thread{
	public void rum(){
		System.out.println(Thread.currentThread().getName());
	}
}
class ThreadDemo{
	public static void main(String [] args){
		myThread obj = new myThread();
		obj.start();

		obj.yield();

		System.out.println(Thread.currentThread().getName());		
	}
}
