import java.util.Scanner;
import java.util.Arrays;

class Demo{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of array: ");
                int size=sc.nextInt();
                System.out.println("Enter array elements: ");
                int arr[] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		Arrays.sort(arr);
		System.out.println("Smallest: " + arr[0]);
		if(arr[0]==arr[1]){
			for(int i=2;i<arr.length;i++){
				if(arr[0]!=arr[i]){
					System.out.println("Second smallest: " + arr[i]);
					break;
				}
			}
		}
		else{
			System.out.println("Second smallest: " + arr[1]);
		}
	}
}
