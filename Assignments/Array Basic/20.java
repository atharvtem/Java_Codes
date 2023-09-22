import java.util.Scanner;

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
		System.out.println("Enter target sum: ");
		int x = sc.nextInt();
		int sum=0;
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				sum=arr[i]+arr[j];
				if(sum==x){
					System.out.println("Yes");
					count++;
					break;
				}
			}
			if(count>0){
				break;
			}
		}
		if(count==0){
			System.out.println("No");
		}
	}
}
