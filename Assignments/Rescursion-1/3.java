class demo{
	static int recursion(int n){
		if(n==0){
			return 0;
		}
		int sum = n;
		sum = sum + recursion(n-1);
		return sum;
	}
	public static void main(String [] args){
		System.out.println(recursion(100));
	}
}
