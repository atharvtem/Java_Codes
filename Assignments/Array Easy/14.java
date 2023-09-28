import java.util.*;

class Demo{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of array1: ");
                int size1 = sc.nextInt();
                int arr1[] = new int[size1];
                System.out.println("Enter elements of array1: ");
                for(int i=0;i<arr1.length;i++){
                        arr1[i]=sc.nextInt();
                }
		System.out.println("Enter size of array2: ");
                int size2 = sc.nextInt();
                int arr2[] = new int[size2];
                System.out.println("Enter elements of array2: ");
                for(int i=0;i<arr2.length;i++){
                        arr2[i]=sc.nextInt();
                }
		int count=0;
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					count++;
					break;
				}
			}
		}
		System.out.println("Answer: " + count);
	}
}
