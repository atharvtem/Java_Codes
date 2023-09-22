import java.util.Scanner;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array 1: ");
		int size1 = sc.nextInt();
		int arr1[] = new int[size1];
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter size of array 2: ");
                int size2 = sc.nextInt();
                int arr2[] = new int[size2];
                for(int i=0;i<arr2.length;i++){
                        arr2[i]=sc.nextInt();
                }
		System.out.println("Enter size of array 3: ");
                int size3 = sc.nextInt();
                int arr3[] = new int[size3];
                for(int i=0;i<arr3.length;i++){
                        arr3[i]=sc.nextInt();
                }
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					for(int k=0;k<arr3.length;k++){
						if(arr2[j]==arr3[k]){
							System.out.println(arr3[k]);
						}
                                	}
				}
			}
		}

	}
}
