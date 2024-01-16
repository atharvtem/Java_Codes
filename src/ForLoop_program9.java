public class ForLoop_program9 {
    public static void main(String[] args) {
        for(int i=1;i<=40;i++){
            if((i%3==0) && (i%5==0)){
                break;
            }
            else{
                System.out.println(i);
            }
        }
    }
}
