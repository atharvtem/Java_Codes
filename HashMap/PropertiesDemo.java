import java.util.*;
import java.io.*;

class PropertiesDemo{
	public static void main(String [] args)throws IOException{
		Properties obj = new Properties();
		FileInputStream INobj = new FileInputStream("friends.properties");
		obj.load(INobj);
		String name = obj.getProperty("Ashish");
		System.out.println(name);
		obj.setProperty("Jinesh","IT");
		FileOutputStream OUTobj = new FileOutputStream("friends.properties");
		obj.store(OUTobj,"Updated by Atharv");

	}
}
