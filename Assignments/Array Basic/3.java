import java.util.Scanner;

class Demo{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter size:");
                int n = sc.nextInt();
                int [] arr = new int [n];
                for(int i=0;i<arr.length;i++){
                        System.out.println("Enter element:");
                        arr[i]=sc.nextInt();
                }
                int max=-1;
                int min=Integer.MAX_VALUE;
                for(int j=0;j<arr.length;j++){
                        if(arr[j]>max){
                                max=arr[j];
                        }
                }
                System.out.println(max);
        }
}

