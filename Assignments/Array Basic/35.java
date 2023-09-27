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
		System.out.println("Enter k: ");
		int k= sc.nextInt();
		int prod=0;
		for(int i=0;i<arr.length-k-1;i++){
			int temp=1;
			for(int j=i;j<k;j++){
				temp = temp * arr[j];	
			}
			if(prod>temp){
				prod=temp;
			}
		}
		System.out.println("Ans: " + prod);
	}
}
