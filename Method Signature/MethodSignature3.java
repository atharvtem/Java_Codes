class demo{
	int x=10;
	demo(){
		this(20);
		System.out.println(this);
		System.out.println("In no-arguments constructor");
		System.out.println("---------------------------------");
	}
	demo(int x){
		System.out.println(this);
		System.out.println(this.x);
		System.out.println(x);
		System.out.println("In parameterised Constructor");
		System.out.println("---------------------------------");
	}
	demo(demo xyz){
		this(xyz.x);
		System.out.println(this);
		System.out.println("In para demo");
		System.out.println("---------------------------------");
	}
	public static void main(String[] args){
		demo obj = new demo(new demo());
		System.out.println(obj);
	}
}
