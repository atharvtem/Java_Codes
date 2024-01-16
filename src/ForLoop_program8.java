public class ForLoop_program8 {
    public static void main(String[] args){
        int N=23;
        int temp=N;
        int rem=0;
        int sum=0;
        while(N!=0){
            rem=N%10;
            sum=sum+ (rem * rem * rem);
            N=N/10;
        }
        if(sum==temp){
            System.out.println("It is an Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
    }
}
