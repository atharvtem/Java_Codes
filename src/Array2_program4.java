import java.util.Scanner;

public class Array2_program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimention of array:");
        int size= sc.nextInt();
        int arr[]= new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element "+ i+1);
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number you want to search:");
        int num= sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num) {
                System.out.println("Index:" + i);
                count++;
            }
        }
        if(count!=0){
            System.out.println("Number not found in array");
        }
    }
}
