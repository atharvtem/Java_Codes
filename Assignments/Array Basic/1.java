import java.util.Scanner;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int n = sc.nextInt();
		int arr[] = new int [n];
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter number " + i + ":");
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter target:");
		int x = sc.nextInt();
		for(int j=0;j<arr.length;j++){
			if(arr[j]==x){
				System.out.println(j);
			}
		}
	}
}
