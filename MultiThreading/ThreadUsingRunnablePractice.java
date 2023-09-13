class Mythread implements Runnable{
	public void run(){
		System.out.println("Mythread: " + Thread.currentThread().getName());
	}
}

class Demo{
	public static void main(String [] args){
		System.out.println("Main: "+Thread.currentThread().getName());
		Mythread obj = new Mythread();
		Thread t = new Thread(obj);
		t.start();
		System.out.println("Last statement: "+Thread.currentThread().getName());
	}
}
