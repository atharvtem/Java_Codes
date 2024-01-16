import java.io.*;

public class BufferclassCode1 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int integer = Integer.parseInt(br.readLine());
        float floatnum= Float.parseFloat(br.readLine());
        double doublenum= Double.parseDouble(br.readLine());
        String stringvar= br.readLine();
        char ch = br.readLine().charAt(0);
        System.out.println(integer);
        System.out.println(floatnum);
        System.out.println(doublenum);
        System.out.println(stringvar);
        System.out.println(ch);

    }
}
