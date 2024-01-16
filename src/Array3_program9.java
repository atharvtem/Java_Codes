import java.util.Scanner;

public class Array3_program9 {
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
        int max1=temp[0];
        for(int i=0;i<temp.length;i++){
            if(temp[i]>max1){
                max1=temp[i];
            }
        }
        for(int i=0;i<temp.length;i++){
            if(max1==temp[i]){
                temp[i]=-1111;
            }
        }
        int max2=temp[0];
        for(int i=0;i<temp.length;i++){
            if(temp[i]>max2){
                max2=temp[i];
            }
        }
        System.out.println("Second Max element is : " + max2);
    }
}
