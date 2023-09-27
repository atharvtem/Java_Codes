import java.util.Scanner;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int N = sc.nextInt();
		int [] arr = new int[N];
		System.out.println("Enter array elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int j=1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=j){
				System.out.println(arr[i-1]+1);
				break;
			}
			j++;
		}
	}
}
