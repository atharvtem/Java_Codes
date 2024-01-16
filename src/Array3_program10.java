import java.util.Scanner;

public class Array3_program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] temp=new int[size];
        for(int i=0;i<temp.length;i++){
            temp[i]=arr[i];
        }
        int min1=temp[0];
        for(int i=0;i<temp.length;i++){
            if(temp[i]<min1){
                min1=temp[i];
            }
        }
        for(int i=0;i<temp.length;i++){
            if(min1==temp[i]){
                temp[i]=99999999;
            }
        }
        int min2=temp[0];
        for(int i=0;i<temp.length;i++){
            if(temp[i]<min2){
                min2=temp[i];
            }
        }
        System.out.println("Second Max element is : " + min2);
    }
}
