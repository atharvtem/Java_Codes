class demo{
	static int x=0;
	static void test(){
		System.out.println(x++);
		test();
	}
	public static void main(String [] args){
		test();
	}
}
