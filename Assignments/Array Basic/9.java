import java.util.Scanner;

class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int size=sc.nextInt();
		int arr1[] = new int[size];
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
//			System.out.println(arr1[i]);
		}
		System.out.println("Enter index you want to remove: ");
		int idx = sc.nextInt();
		int arr2[] = new int[size-1];
		int j=0;
		for(int i=0;i<arr1.length;i++){
			if(i==idx){
                                continue;
                        }
			else{
				arr2[j]=arr1[i];
				j++;
			}
		}
		System.out.println("New array: ");
		for(int k=0;k<arr2.length;k++){
			System.out.println(arr2[k]);
		}
	}
}
