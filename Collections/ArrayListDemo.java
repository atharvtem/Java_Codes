import java.util.*;
import java.lang.*;
class ArrayListDemo extends ArrayList{
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20.5f);
		al.add("Shashi");
		al.add(10);
		al.add(20.5f);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains("Shashi"));
		System.out.println(al.indexOf(20.5f));
		System.out.println(al.lastIndexOf(20.5f));
		al.add(3,"Core2Web");
		System.out.println(al);
		System.out.println(al.get(3));
		ArrayList al2 = new ArrayList();
		al2.add("Modern Family");
		al2.add("F.R.I.E.N.D.S");
		al2.add("GOT");
		al.addAll(al2);
		System.out.println(al);
		al.addAll(2,al2);
		System.out.println(al);
		System.out.println(al.indexOf("GOT"));
		System.out.println(al.remove(4));
		System.out.println(al);
		System.out.println(al.remove("Modern Family"));
		System.out.println(al);
		//code written upto this creates ArrayList al using:
		//ArrayList al = new ArrayList();
		//now we are going to use removeRange function which is protected. So , we have to extend class with ArrayList as:
		//class ArrayListDemo extends ArrayList{}
		//fom here, you can make list using classname i.e. ArrayListDemo
		ArrayListDemo al3 = new ArrayListDemo();
		for(int i=1;i<11;i++){
			al3.add(i*i);
		}
		System.out.println(al3);
		al3.removeRange(3,6);
		System.out.println(al3);
		Object [] arr = al3.toArray();
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(al2.remove(2));
		al2.clear();
		System.out.println(al2);
	}
}
