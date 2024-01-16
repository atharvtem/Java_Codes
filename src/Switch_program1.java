public class Switch_program1 {
    public static void main(String[] args) {
        int x=3;
        switch(x){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("not one,two,three");
                break;
        }
        System.out.println("After Swtich Case");
    }
}
