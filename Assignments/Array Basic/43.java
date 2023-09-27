import java.util.Scanner;

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
		System.out.println("Enter num 1: ");
		int num1= sc.nextInt();
		System.out.println("Enter num 2: ");
		int num2= sc.nextInt();
		int start=-1,end=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==num1){
				start=i;
			}
			else if(arr[i]==num2){
				end = i;
			}
		}
		System.out.println("Ans: "+((end-1)-(start+1)+1));
	}
}


