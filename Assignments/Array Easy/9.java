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
		int count=0;
		int maincount=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){
				count++;
			}
			else if(arr[i]==1){
				maincount++;
				break;
			}
		}
		if(maincount!=-1 && count>0){
			System.out.println("Answer: "+count);
		}
		else if(maincount==-1){
			System.out.println("Answer: "+maincount);
		}
	}
}
