public class WhileLoop_program9 {
    public static void main(String [] args){

        int num=942111423;
        int temp= num;
        int rem=num%10;
        int newnum=rem;
        num=num/10;
        while(num!=0){
            rem=num%10;
            num=num/10;
            newnum=newnum*10+rem;
        }
        System.out.println(newnum);
    }
}
