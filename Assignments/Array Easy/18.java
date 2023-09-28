import java.util.*;

class Demo{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of array: ");
                int size = sc.nextInt();
                Object arr[] = new Object[size];
                System.out.println("Enter elements of array: ");
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
                Arrays.sort(arr , Collections.reverseOrder());
		System.out.println("Answer: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}
}
