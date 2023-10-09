import java.util.Scanner;

class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		System.out.println("Enter elements of array: ");
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i =0 ;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("Answer: " + (max+min));
	}
}
