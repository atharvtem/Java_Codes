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
					if(x-arr[i-1]<arr[i]-x){
						System.out.println("Closest number: "+arr[i-1]);	
						break;
					}
					else if(arr[i]-x<=x-arr[i-1]){
						System.out.println("Closest number: "+arr[i]);
						break;
					}
				}
			}
		}
	}
}
