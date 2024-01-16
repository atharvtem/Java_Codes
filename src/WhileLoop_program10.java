public class WhileLoop_program10 {
    public static void main(String[] args){
        int num=2332;
        int temp=num;
        int rem=num%10;
        int newnum = rem;
        num=num/10;
        while(num!=0){
            rem=num%10;
            num=num/10;
            newnum =newnum *10+rem;
        }
        if(temp==newnum)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

