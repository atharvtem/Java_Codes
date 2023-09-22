import java.util.Scanner;

class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int N=sc.nextInt();
		System.out.println("Enter target: ");
		int X=sc.nextInt();
		int firstocc=-1;
		int [] arr = new int[N];
		System.out.println("Enter array elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int lastocc=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==X){
                                firstocc=i;
                                break;
                        }
		}
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i]==X){
				lastocc=i;
				break;
			}
		}
		if(firstocc == -1){
			System.out.rpintln(firstocc);
		}
		else{
			System.out.println("Output: "+ firstocc + " "+ lastocc);
		}
	}
}

