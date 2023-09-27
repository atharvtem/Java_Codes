import java.util.*;

class Demo{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size of array: ");
                int size=sc.nextInt();
                int [] arr = new int[size];
                System.out.println("Enter elements of array: ");
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
		int max=-1;
		for(int i=arr.length-1;i>=0;i--){
			if(i==arr.length-1){
				System.out.print(arr[i]+ ", ");
				max=arr[i];
			}
			else if(arr[i]>max){
				System.out.print(arr[i] + ", ");
				max=arr[i];
			}

		}
	}
}
