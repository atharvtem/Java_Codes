import java.util.Scanner;

public class Array3_program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            int count=0;
            int temp1=arr[i];
            int temp2=arr[i];
            while(temp1!=0){
                count++;
                temp1/=10;
            }
            int sum=0;
            while(temp2!=0){
                int digit=temp2%10;
                int multiplication=1;
                for(int j=0;j<count;j++){
                    multiplication=multiplication*digit;
                }
                sum=sum+multiplication;
                temp2/=10;
            }
            if(arr[i]==sum){
                System.out.println("It is an armstrong number at index: "+i);
            }
        }
    }
}
