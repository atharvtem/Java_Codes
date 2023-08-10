interface demo1{
	void gun();
}
interface demo2{
	void gun();
}
class demochild implements demo1,demo2{
	public void gun(){
		System.out.println("in gun demochild");
	}
}
class client{
	public static void main(String [] args){
		demo1 obj1 = new demochild();
		obj1.gun();
		demo2 obj2 = new demochild();
		obj2.gun();
	}
}
