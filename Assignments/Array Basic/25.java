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
		int product=1;
		for(int i=0;i<arr.length-1;i++){
			int newproduct = arr[i]*arr[i+1];
			if(product<newproduct){
				product = newproduct;
			}
		}
		System.out.println("Max Product: " + product);
	}
}
