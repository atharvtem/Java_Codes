import java.util.Scanner;
import java.util.*;

class Demo{
        public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter number:");
                int num = sc.nextInt();
		int temp=num;
		int newnum=0;
		int count=0;
		while(temp!=0){
			temp=temp/10;
			count++;
		}
		int[] arr = new int[count];
		int i=0;
		while(num!=0){
			arr[i]=num%10;
			num=num/10;
			i++;
		}
		for(int j=count-1;j>=0;j--){
			if(arr[j]==0){
				arr[j]=5;
			}
			newnum=(newnum*10)+arr[j];
		}
		System.out.println(newnum);
                
	}
}
