import java.util.Scanner;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first array size:");
		int size1= sc.nextInt();
		System.out.println("Enter elements in first array:");
		int [] arr1 = new int[size1];
		int max1 = Integer.MIN_VALUE;
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
			if(arr1[i]>max1){
				max1=arr1[i];
			}
		}
		System.out.println("Enter size of array 2: ");
		int size2 = sc.nextInt();
		System.out.println("Enter elements of array 2: ");
		int [] arr2 = new int[size2];
		int min2 = Integer.MAX_VALUE;
		for(int i=0;i<arr2.length;i++){
			arr2[i]=sc.nextInt();
			if(arr2[i]<min2){
				min2=arr2[i];
			}
		}
		System.out.println("Output: "+max1*min2);

	}
}
