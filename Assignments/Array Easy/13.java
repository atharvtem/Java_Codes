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
		System.out.println("Enter first number: ");
		int x = sc.nextInt();
		System.out.println("Enter secod number: ");
		int y = sc.nextInt();
		int first=-1,last=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==x){
				if(first!=-1){
                                        continue;
                                }
				first=i;
			}
			else if(arr[i]==y){
				if(last!=-1){
					continue;
				}
				last=i;
			}
		}
		if(first==-1 || last==-1){
			System.out.println("Answer: -1");
		}
		else
			System.out.println("Answer: " + (last-first));
	}
}
