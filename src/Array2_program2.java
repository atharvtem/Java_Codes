import java.util.Scanner;

public class Array2_program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimention of array:");
        int size= sc.nextInt();
        int arr[]= new int[size];
        int even=0,odd=0;
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element "+ i);
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                even++;
            }
        }
        odd=arr.length-even;
        System.out.println("Count of even :"+even);
        System.out.println("Count of odd:"+odd);
    }
}
