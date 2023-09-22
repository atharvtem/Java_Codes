import java.util.Scanner;
import java.util.Arrays;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		int [] arr = new int[size];
		System.out.println("Enter range");
		int start =sc.nextInt();
		int end = sc.nextInt();
		System.out.println("Enter elements of array:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int count=0;
		for(int j=0;j<arr.length;j++){
			if(arr[j]==start){
				count++;
				start++;
			}

		}
                if(count==end-start+1){
	                System.out.println("Yes");
                }
                else{
                        System.out.println("No");
                }

	}


}
