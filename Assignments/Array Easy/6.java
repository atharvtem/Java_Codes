import java.util.*;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements of array: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int max=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--){
			if(arr[i]!=max){
				System.out.println("Second min.: " + arr[i]);
				break;
			}
		}

	}
}
