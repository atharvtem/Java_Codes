 import java.util.*;
 
 class VectorDemo{
 	public static void main(String[] args){
		Vector v = new Vector();
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);
                v.addElement(60);
                v.addElement(70);
                v.addElement(80);
		v.addElement(90);
                v.addElement(100);
                v.addElement(110);
                v.addElement(120);

		System.out.println(v);
		System.out.println("size: "+ v.capacity());
		System.out.println("removed element : " + v.removeElement(110));
		System.out.println(v);
	}
 }
