class myThread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("In thread 0");
		}
	}
}
class ThreadDemo{
	public static void main(String[] args)throws InterruptedException{
		myThread obj = new myThread();
		obj.start();
		obj.join();
		// if we do not join, first main is printed and then thread 0
		// if we join, first thread 0  is printed and then main
		// join is nothing but thread have joined and one will wait for another one to finish their task
		for(int i=0;i<10;i++){
			System.out.println("In main");
		}
	}
}
