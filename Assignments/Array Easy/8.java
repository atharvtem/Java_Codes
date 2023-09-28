import java.util.*;

class Demo{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of array: ");
                int size = sc.nextInt();
                int arr[] = new int[size];
                System.out.println("Enter elements of array: ");
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		System.out.println("Enter number of steps: ");
		int D = sc.nextInt();
		for(int i=0;i<D;i++){
			arr = rotate(arr);
		}
		System.out.println("Answer:");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
	}
	public static int[] rotate(int [] num){
		int temp = num[0];
		for(int i=0;i<num.length-1;i++){
			num[i]=num[i+1];
		}
		num[num.length-1]=temp;
		return num;
	}
}
