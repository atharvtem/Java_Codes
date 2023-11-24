class demo{
	static int recursion(int n){
		if(n/10==0){
			return 1;
		}
		return recursion(n/10)+1;
	}
	public static void main(String [] args){
//		recursion(1234);
		System.out.println(recursion(1234));
	}
}
