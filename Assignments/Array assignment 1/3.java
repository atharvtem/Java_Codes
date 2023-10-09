import java.util.Scanner;

class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		System.out.println("Enter array elements: ");
		int a [] = new int[size];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int b[][] = new int[2][2];
		System.out.println("Enter elements of array B: ");
		for(int i=0;i<2;i++){
			System.out.println("Enter elements of row " + i + " :");
			for(int j=0;j<2;j++){
				b[i][j]=sc.nextInt();
			}
		}
		int c []=new int[2];
		for(int i=0;i<2;i++){
			int j=0,sum=0;
			for(int k=b[i][j];k<=b[i][1];k++){
				sum=sum+a[k];
				j++;
			}
			c[i]=sum;
		}
		System.out.println("Answer: ");
		for(int i=0;i<2;i++){
			System.out.print(c[i] + " ");
		}
	}
}
