import java.util.*;

class Demo{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of array: ");
                int size=sc.nextInt();
                int [] arr = new int[size];
                System.out.println("Enter elements of array: ");
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		for(int i=0;i<arr.length;i++){
			if(isFibo(arr[i])){
				System.out.print(arr[i] + ", ");
			}
			else
				continue;
		}

	}
	static boolean isPerfectSqrt(int num){
		int sqrtX = (int ) Math.sqrt(num);
		return ((sqrtX * sqrtX) == num);
	}
	static boolean isFibo(int n){
		return isPerfectSqrt(5*n*n+4) || isPerfectSqrt(5*n*n-4);
	}
}
