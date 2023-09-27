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
		for(int i=1;i<arr.length-1;i++){
			if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
				System.out.print(arr[i] + ", ");
			}
		}
	}
}
