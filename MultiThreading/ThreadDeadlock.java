class myThread extends Thread{
	static Thread nmMain = null;
	public void run(){
		try{
			nmMain.join();
		}catch(InterruptedException ae){
			
		}
		for(int i=0;i<10;i++){
			System.out.println("in thread 0");
		}
	}
}
class ThreadDemo{
	public static void main(String [] args)throws InterruptedException{
		myThread obj = new myThread();
		obj.start();
		obj.join();
		for(int i=0;i<10;i++){
			System.out.println("in main");
		}
	}
}
