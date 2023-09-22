import java.util.Scanner;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n=sc.nextInt();
		System.out.println("Enter multiple: ");
		int k=sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			int count=1;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count%k!=0){
				System.out.println("Answer: "+arr[i]);
				break;
			}
		}
	}
}
