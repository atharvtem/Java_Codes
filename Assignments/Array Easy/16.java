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
		int min=Integer.MAX_VALUE;
		int minidx=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
				minidx=i;
			}
		}
		System.out.println("Answer:" + minidx);
	}
}
