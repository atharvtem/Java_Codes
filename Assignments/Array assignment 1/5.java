import java.util.Scanner;

class demo{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of array:");
                int size=sc.nextInt();
                System.out.println("Enter array elements: ");
                int arr [] = new int[size];
		int prefixsum=0;
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
			prefixsum=prefixsum+arr[i];
			arr[i]=prefixsum;
                }
		System.out.println("Ans: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
        }
}     
