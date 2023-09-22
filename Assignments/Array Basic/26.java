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
		for(int i=0;i<arr.length-1;i=i+2){
			int temp = arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		System.out.println("New array: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}
}
