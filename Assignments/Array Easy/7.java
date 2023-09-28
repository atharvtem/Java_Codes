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
		if(arr[0]>arr[1]){
			int count=0;
			for(int i=0;i<arr.length-1;i++){
                       		if(arr[i]<arr[i+1]){
					System.out.println("Answer: 0");
					count++;
					break;
				}
                	}
			if(count==0){
				System.out.println("Answer : 1");
			}
		}
		else if(arr[0]<arr[1]){
			int count=0;
			for(int i=0;i<arr.length-1;i++){
        	                if(arr[i]>arr[i+1]){
					System.out.println("Answer: 0");
					count++;
					break;
				}
	                }
			if(count==0){
				System.out.println("Answer: 1");
			}
		}
	}
}
