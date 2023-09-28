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
		for(int i=0;i<arr.length-1;i++){
			int count =1;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count>1){
				System.out.println("Answer: " + i);
				size++;
				break;
			}
		}
		if(size==arr.length){
			System.out.println("Answer: -1");
		}
	}
}
