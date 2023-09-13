class Mythread extends Thread{
	public void run(){
		System.out.println("Mythread: " +Thread.currentThread().getName());
		Thread.currentThread().setName("Thread 3");
                System.out.println("After changing name: " +Thread.currentThread().getName());

	}
}

class Mythread2 extends Mythread{
	public void run(){
		System.out.println("Mythread 2: " +Thread.currentThread().getName());
		Thread.currentThread().setName("Thread 2");
                System.out.println("After changing name: " +Thread.currentThread().getName());
		Mythread obj2 = new Mythread();
		obj2.start();
	}
}

class Demo{
	public static void main(String [] args){
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("Thread 1 (main)");
                System.out.println("After changing name: " +Thread.currentThread().getName());
		Mythread2 obj1 = new Mythread2();
		obj1.start();
		
	}
}
