import java.util.Scanner;

public class Array2_program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimention of array:");
        int size= sc.nextInt();
        int arr[]= new int[size];
        int min=1000;
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element "+ i+1);
            arr[i]=sc.nextInt();
        }
        System.out.println("Minimum element is :"+ min);
    }
//    public static int min(arr[]){
//        int min=0;
//        return min;
//    }
}
