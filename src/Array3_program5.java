import java.util.Scanner;

public class Array3_program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int arr[] = new int[size];
        int divisor=0;
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
            for(int j=1;j<arr[i];j++){
                if(arr[i]%j==0){
                    divisor=divisor+j;
                }
            }
            if(arr[i]==divisor){
                System.out.println("Number " + arr[i] + " is a perfect number at index: "+i);
            }
        }
    }
}
