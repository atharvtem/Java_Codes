import java.util.Scanner;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int N = sc.nextInt();
		System.out.println("Enter limit: ");
		int k = sc.nextInt();
		int [] arr = new int [N];
		System.out.println("Enter elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int count=1;
		int numcount=0;
		int num=-1;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(numcount<count){
				numcount=count;
				num=arr[i];
			}
		}
		System.out.println("Most frequent number: "+num);
	}
}
