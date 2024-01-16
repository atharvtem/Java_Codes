import java.util.*;
public class Array3_program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            int newnum=0;
            while(arr[i]!=0){
                int reminder= arr[i]%10;
                newnum=newnum*10+reminder;
                arr[i]=arr[i]/10;
            }
            System.out.println(newnum);
        }

    }
}
