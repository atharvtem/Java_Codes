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
		Set l = new HashSet();
		for(int i=0;i<arr1.length;i++){
			l.add(arr1[i]);
		}
		for(int j=0;j<arr2.length;j++){
			l.add(arr2[j]);
		}
		Object [] arr3 = l.toArray();
		System.out.println("Answer: ");
		for(int i=0;i<arr3.length;i++){
			System.out.print(arr3[i] + " ");
		}
	}
}
