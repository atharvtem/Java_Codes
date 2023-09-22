import java.util.*;

class Demo{
        public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a String :");
                String s = sc.nextLine();
                int l = s.length();
                int lastindex=0;
                for(int i=0;i<l;i++){
                        if(s.charAt(i)=='1'){
                                if(i>lastindex){
                                        lastindex=i;
                                }
                        }
                }
                System.out.println("ans: "+lastindex);
        }
}
