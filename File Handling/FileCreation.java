import java.io.*;

class FildeDemo{
	public static void main(String [] args)throws IOException{
		File fobj1 = new File("FileHandlingDemo");
		fobj1.mkdir();
		File fobj2 = new File(fobj1,"Code1.txt");
		fobj2.createNewFile();
	}
}
