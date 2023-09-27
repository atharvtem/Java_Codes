import java.util.*;

class Demo{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter number of soldiers: ");
                int size=sc.nextInt();
                int [] arr1 = new int[size];
                System.out.println("Enter power of soldiers of nation A: ");
                for(int i=0;i<arr1.length;i++){
                        arr1[i]=sc.nextInt();
             	}
                int [] arr2 = new int[size];
                System.out.println("Enter power of soldiers of nation B: ");
                for(int i=0;i<arr2.length;i++){
                        arr2[i]=sc.nextInt();
                }
		for(int i=0;i<size;i++){
			if(arr1[i]==arr2[i]){
				arr1[i]=0;
				arr2[i]=0;
			}
			else if(arr1[i]<arr2[i]){
				arr1[i]=0;
				arr2[i]=1;
			}
			else{
				arr1[i]=1;
				arr2[i]=0;
			}
		}
		int power1=0,power2=0;
		for(int i=0;i<size;i++){
			power1= power1 + arr1[i];
			power2= power2 + arr2[i];
		}
		System.out.println("Winner nation: ");
		if(power1==power2){
			System.out.println("Tie");
		}
		else if(power1>power2){
			System.out.println("A");
		}
		else
			System.out.println("B");
	}
}
