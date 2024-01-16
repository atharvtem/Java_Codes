import java.util.Scanner;

public class Array2_program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dimention of array:");
        int size= sc.nextInt();
        int arr[]= new int[size];
        int evensum=0,oddsum=0;
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element "+ i+1);
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                evensum=evensum+arr[i];
            }
            else{
                oddsum=oddsum+arr[i];
            }
        }
        System.out.println("Sum of even :"+evensum);
        System.out.println("Sum of odd:"+oddsum);
    }
}
