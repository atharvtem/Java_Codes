public class ForLoop_program7 {
    public static void main(String[] args){
        int N=6;
        int sum=0;
        int count=0;
        for(int i=1;i<N;i++){
            sum=sum+i;
            if(sum==N){
                System.out.println("It is a perfect number.");
                count++;
                break;
            }
        }
        if(count==0){
        System.out.println("not a perfect number");}
    }
}
