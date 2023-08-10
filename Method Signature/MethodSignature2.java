class demo{
	int x=10;
	demo(){
		System.out.println("In constructor 1");
		System.out.println(this);
		System.out.println(this.x);
	}
	void fun(){
		System.out.println(this);
		System.out.println(this.x);
	}
	public static void main(String[] args){
		demo obj1=new demo();
		System.out.println(obj1);
		obj1.fun();
	}

}
