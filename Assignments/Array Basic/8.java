import java.util.Scanner;
import java.util.Arrays;
class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size:");
		int size=sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter array elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Answer: ");
		int bucket =0;
		for(int i=0;i<arr.length-1;i++){
			int count=1;
			if(arr[i]==arr[i+1]){
				int j=i+1;
				while(arr[i]==arr[j]){
					j++;
					count++;
					if(j==arr.length){
						break;
					}
				}
				if(count%2==0){
					bucket++;		
					System.out.print(arr[i]+" ");
				}
			}
			else
				continue;
		}
		if(bucket==0){
			System.out.println("-1");
		}
	}
}
