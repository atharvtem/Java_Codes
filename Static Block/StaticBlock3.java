class demo{
	static{
		System.out.println("Static blokc 1");
	}
	public static void main(String [] args){
		System.out.println("Main method of demo");
	}
}
class client{
	static{
		System.out.println("Statci block 2");
	}
	public static void main(String[] args){
		System.out.println("Main method of client");
	}
	static{
		System.out.println("Static block 3");
	}
}

//execute it as:
//	first execute demo main function
//	then execute client main function
//and see the difference in outputs
