class demo{
	int x=10;
	demo(){
		System.out.println("In constructor");
	}
	demo(int x){
		System.out.println("In parameterized constructor");
	}
	demo(demo xyz){
		System.out.println("Demo as parameter");
	}
	public static void main(String[] args){
		demo obj1 = new demo();
		demo obj2 = new demo(10);
		demo obj3 = new demo(obj1);
	}
}
