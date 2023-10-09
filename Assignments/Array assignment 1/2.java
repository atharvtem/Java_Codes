import java.util.Scanner;

class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size = sc.nextInt();
		int arr [] = new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter target: ");
		int target=sc.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==target){
				count++;
			}
		}
		System.out.println("Number of occurances: " + count);
	}
}
