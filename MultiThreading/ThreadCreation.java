class Demo extends Thread{
	public void run(){
		System.out.println("Demo: "+ Thread.currentThread().getName());
	}
}
class myThread extends Thread{
	public void run(){
		System.out.println("myThread :"+ Thread.currentThread().getName());

        	Demo obj = new Demo();
	        obj.start();
	}
	
}
class ThreadDemo{
	public static void main(String [] args){
		System.out.println("ThreadDemo :" + Thread.currentThread().getName());

		myThread obj = new myThread();
		obj.start();
	}
}
