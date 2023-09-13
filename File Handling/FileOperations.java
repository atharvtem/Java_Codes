import java.io.*;

class FileDemo{
	public static void main(String [] args)throws IOException{
		File fobj = new File("Incubator.txt");
		fobj.createNewFile();
		/*
		System.out.println(fobj.getName());
		System.out.println(fobj.getParent());
		System.out.println(fobj.getPath());
		System.out.println(fobj.getAbsolutePath());
		System.out.println(fobj.canRead());
                System.out.println(fobj.canWrite());
                System.out.println(fobj.isDirectory());
                System.out.println(fobj.isFile());
                System.out.println(fobj.lastModified());
		*/
		int count=0;
		String [] Files = fobj.list();
		for(String str:Files){
			File f = new File(str);
			if(f.isFile()){
				count++;
			}
		}
		System.out.println("Number of files :" + count);
	}
}
