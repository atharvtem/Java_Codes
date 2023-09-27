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
		System.out.println("Answer: ");
		int count=0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]==arr[i+1]){
				System.out.println(arr[i]);
				count++;
				i++;
			}
		}
		if(count==0){
			System.out.println("-1");
                }

	}
}
