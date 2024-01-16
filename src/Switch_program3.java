public class Switch_program3 {
    public static void main(String[] args) {
        int x=3;
        int a=1;
        int b=2;
        switch (b){
//            case b:
//                System.out.println("3");
//                break;
            default:
                throw new IllegalStateException("Unexpected value: " + b);
        }
    }
}
//switch case must contain constant and not the expression