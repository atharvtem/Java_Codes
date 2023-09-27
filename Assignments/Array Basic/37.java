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
		int arr2[] = new int[size];
		int j=arr2.length-1;
		int i=0,k=0;
		while(k<arr.length){
			if(arr[k]<0){
				arr2[i]=arr[k];
				k++;
				i++;
			}
			else{
				arr2[j]=arr[k];
				j--;
				k++;
			}
		}
		System.out.println("New array: ");
		for(int a=0;a<arr.length;a++){
			System.out.print(arr2[a] + ", ");
		}
	}
}
