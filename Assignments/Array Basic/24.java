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
                System.out.println("Enter target : ");
                int x = sc.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>x){
				if(arr[i-1]<x){
					System.out.println("Floor: " + arr[i-1] + ", Ceil: " + arr[i]);
					count++;
					break;
				}
			}
		}
		if(count==0){
			if(x<=arr[0]){
				System.out.println("Floor: " + "-1"  + ", Ceil: " + arr[0]);
			}
			else if(x>=arr[arr.length-1]){
				System.out.println("Floor: " + arr[arr.length-1] + ", Ceil: " + "-1");
			}
		}
	}
}
