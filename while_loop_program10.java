public class while_loop_program10 {
    public static void main(String[] args){
        int num=2332;
        int temp=num;
        int rem=num%10;
        int new=rem;
        num=num/10;
        while(num!=0){
            rem=num%10;
            num=num/10;
            new=new*10+rem;
        }
        if(temp==new)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
