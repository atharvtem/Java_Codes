import java.util.Scanner;
public class Array2_program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimention of array:");
        int size= sc.nextInt();
        int arr[]= new int[size];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element "+ i);
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println("Sum:"+sum);
    }
}

