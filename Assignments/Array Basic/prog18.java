import java.util.Scanner;

class Demo{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size: ");
                int size = sc.nextInt();
                System.out.println("Enter sum: ");
                int target = sc.nextInt();
                int [] arr = new int[size];
                System.out.println("Enter array elements: ");
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }
                int start=-1;
                int end = -1;
                for(int i=0;i<arr.length;i++){
                        int sum=0;
                        for(int j=i;j<arr.length;j++){
                                sum=sum+arr[j];
                                if(sum==target){
                                        start=i;
                                        end=j;
                                        break;
                                }
                        }
			if(start>-1){
				break;
			}
                }
                System.out.println("Answer: " + start + ", " + end);
        }
}
//1 4 20 3 10 5
