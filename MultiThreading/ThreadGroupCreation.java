class myThread extends Thread{
	myThread(ThreadGroup tg,String str){
		super(tg,str);
	}
	public void run(){
		System.out.println(Thread.currentThread());
	}
}
class ThreadGroupDemo{
	public static void main(String [] args){
		ThreadGroup pThreadGP = new ThreadGroup("Core2Web");
		myThread obj1 = new myThread(pThreadGP,"C,CPP");
		myThread obj2 = new myThread(pThreadGP,"Java,DSA");
		myThread obj3 = new myThread(pThreadGP,"Python,ML");
		obj1.start();
		obj2.start();
		obj3.start();
	}
}
