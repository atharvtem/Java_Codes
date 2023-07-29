import arithfun.Addition;
import arithfun.Substraction;
import java.util.Scanner;

class Client{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		Addition obj1 = new Addition(a,b);
		Substraction obj2 = new Substraction(a,b);
		System.out.println("Addition :"+obj1.add());
		System.out.println("Substraction :"+obj2.sub());
	}
}
