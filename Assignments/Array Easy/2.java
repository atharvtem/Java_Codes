import java.util.*;

class Demo{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of array: ");
                int N = sc.nextInt();
                int [] arr = new int[N];
                System.out.println("Enter array elements: ");
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
 		}
		Arrays.sort(arr);
		System.out.println("Answer:`");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}
}
