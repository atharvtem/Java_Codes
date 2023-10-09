import java.util.Scanner;

class demo{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of array:");
                int size=sc.nextInt();
                System.out.println("Enter array elements: ");
                int arr [] = new int[size];
		int prod=1;
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
			prod = prod * arr[i];
                }
		System.out.println("ans: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=prod/arr[i];
			System.out.print(arr[i]+" ");
		}

        }
}     
