import java.util.*;

public class Array3_program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            int count=0;
            while(arr[i]!=0){
                int reminder=arr[i]%10;
                if(reminder>=0){
                    count++;
                }
                arr[i]=arr[i]/10;
            }
            System.out.println(count);
        }
    }
}
