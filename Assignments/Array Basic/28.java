//import java.util.Scanner;
import java.util.*;

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
		LinkedHashSet lhs = new LinkedHashSet();
		for(int i=0;i<arr1.length;i++){
			lhs.add(arr1[i]);
		}
		System.out.println(lhs);
	}
}
