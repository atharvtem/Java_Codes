import java.util.Scanner;

class Demo{
	public static void main(String [] args ){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int N = sc.nextInt();
		System.out.println("Enter elements: ");
		int [] arr = new int[N];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					arr[j]=0;
				}
			}
		}
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		System.out.println("Sum:  "+ sum);
	}
}
