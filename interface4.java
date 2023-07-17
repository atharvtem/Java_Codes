interface demo1{
	static void m1(){
		System.out.println("in demo1 m1");
	}
}
interface demo2{
	default void m1(){
		System.out.println("in demo2 m1");
	}
}
interface demo3 extends demo1,demo2{
	
}
class demochild implements demo3{
	public static void main(String [] args){
		demochild obj = new demochild();
		obj.m1();
	}
}
// error if we make both method static
// because, static methods do not inherit in child classes or child interfaces
// in case of default, we do not see any error
