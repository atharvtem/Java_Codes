import java.util.Scanner;
import java.util.Arrays;

class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of digits:");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter digits:");
//		System.out.println("Inputted array:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
//			System.out.print(arr[i]);
		}
		int newnum=0;
		Arrays.sort(arr);
		for(int j=arr.length-1;j>=0;j--){
			newnum = (newnum*10) + arr[j];
		}
/*		for(int j=0;j<arr.length;j++){
			newnum=(newnum*10)+maxNum(arr);
			System.out.println("newnum: "+ newnum);
		}*/
		System.out.println("Biggest possible number is: "+ newnum);
	}

/*	public static int maxNum(int arr[]){
		int max=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=0 && arr[i]<max){
				max=arr[i];
				//	arr[i]=-1;
			}
		}
		return max;
	}*/
}
