public class ForLoop_program6 {
    public static void main(String[] args) {
        int N=70;
        int count=0;
        for(int i=1;i<=N;i++){
            if(N%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Composite Number");
        }
    }
}
