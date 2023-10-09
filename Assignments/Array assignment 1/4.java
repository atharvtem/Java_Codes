import java.util.Scanner;

class demo{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of array:");
                int size=sc.nextInt();
		int max = Integer.MIN_VALUE;
                System.out.println("Enter array elements: ");
                int arr [] = new int[size];
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
			if(arr[i]>max){
				max=arr[i];
			}
                }
		int ans=0;
		for(int i=0;i<arr.length;i++){
			ans=ans+(max-arr[i]);
		}
		System.out.println("No. pof seconds required: " + ans);		
	}
}
