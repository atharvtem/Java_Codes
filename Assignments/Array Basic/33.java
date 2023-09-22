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
		int mid=(arr.length-1)/2;
		int left=0;
		int right=0;
		for(int i=0;i<=mid;i++){
			left = left + arr[i];
		}
		for(int i=mid+1;i<arr.length;i++){
			right = right + arr[i];
		}
		System.out.println("Answer: " + left*right);
	}
}
