interface demo{
	void fun();
	void gun();
}

class demochild implements demo {
	public void fun(){
		System.out.println("in fun");
	}
	public void gun(){
		System.out.println("in gun");
	}
}
class client{
	public static void main(String[] args){
		demo obj = new demochild();
		obj.fun();
		obj.gun();
	}
}
