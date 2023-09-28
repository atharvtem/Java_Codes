import java.util.Scanner;

class Demo{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of array1: ");
                int size1=sc.nextInt();
                System.out.println("Enter first array elements: ");
                int arr1[] = new int[size1];
                for(int i=0;i<arr1.length;i++){
                        arr1[i]=sc.nextInt();
                }
		System.out.println("Enter size of array2: ");
                int size2=sc.nextInt();
		System.out.println("Enter second array elements: ");
                int arr2[] = new int[size2];
                for(int i=0;i<arr2.length;i++){
                        arr2[i]=sc.nextInt();
                }
		System.out.println("Enter sum: ");
		int x= sc.nextInt();
		int count=0;
		System.out.println("Answer: ");
		for(int i=0;i<arr1.length;i++){
			//int sum=0;
			for(int j=0;j<arr2.length;j++){
				int sum=arr1[i]+arr2[j];
				if(x==sum){
					System.out.println(arr1[i] + " " +arr2[j]);
					count++;
				}
			}
		}
//		System.out.println("ans: "+count);
        }

}
