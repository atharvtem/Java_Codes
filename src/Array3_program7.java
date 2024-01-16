import java.util.Scanner;

public class Array3_program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            int temp=arr[i];
            int sum=0;
            while(arr[i]!=0){
                int reminder= arr[i]%10;
                int fact=1;
                for(int j=1;j<=reminder;j++) {
                    fact*=j;
                }
                sum+=fact;
                arr[i]=arr[i]/10;
            }
            if(temp==sum){
                System.out.println("Strong number at index: "+ i);
            }
        }

    }
}
