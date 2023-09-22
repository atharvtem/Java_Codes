import java.util.*;
class Demo{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size :");
                int size = sc.nextInt();
                int [] arr = new int[size];
		System.out.println("Enter elements: ");
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
		}
		int productsum=0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			productsum= productsum + (arr[i]*i);
//			System.out.println(arr[i] + " * "+ i +  " = ");
		}
		System.out.println("Maximized product: " + productsum);
        }
}
