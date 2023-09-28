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
		System.out.println("Enter number X: ");
		int x = sc.nextInt();
		int count=0;
                for(int i=0;i<arr.length;i++){
                        if(arr[i]==x){
	                        count++;
                        }
		}
                System.out.println( x + " is occuring " + count + " time/s");
        }
}



