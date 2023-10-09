import java.util.Scanner;

class demo{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of array:");
                int size=sc.nextInt();
                System.out.println("Enter array elements: ");
                int arr [] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		int max=Integer.MIN_VALUE;
		System.out.println("ans: ");
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i]>max){
				max=arr[i];
				System.out.print(max + " ");
			}
		}
        }
}     
