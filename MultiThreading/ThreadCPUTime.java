class myThread extends Thread{
        myThread(ThreadGroup tg,String str){
                super(tg,str);
        }
        public void run(){
                System.out.println(Thread.currentThread());
		try{
			Thread.sleep(50000);
		}catch(InterruptedException ie){

		}
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
//create two terminals side by side
//first run this code
//then go to another terminal and type 'jconsole' and hit enter 
//select file/program and connect
//gives alrt --> hit 'insecure connection'
