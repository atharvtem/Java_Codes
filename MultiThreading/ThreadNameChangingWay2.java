class myThread extends Thread{
	myThread(String str){
		super(str);
	}
	public void run(){
		System.out.println(getName());
		System.out.println(Thread.currentThread().getThreadGroup());
	}
}
class ThreadDemo{
	public static void main(String[] args){
		myThread obj = new myThread("xyz");
		obj.start();
	}
}
