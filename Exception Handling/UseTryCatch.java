class demo{
	public static void main(String [] args){
		System.out.println("start main");
		try{
			System.out.println(10/0);
		}
		catch(ArithmeticException obj){
			System.out.println("exception occured");
		}
		System.out.println("end main");
	}
}
