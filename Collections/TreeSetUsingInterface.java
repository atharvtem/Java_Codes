import java.util.*;

class MyClass implements Comparable{
	String str=null;
	MyClass(String str){
		this.str=str;
	}
	public int compareTo(MyClass obj){
		return 1;
	}
	public String toString(){
		return str;
	}
}

class TreeSetDemo{
	public static void main(String [] args){
		TreeSet ts = new TreeSet();
		ts.add(new MyClass("KDB"));
                ts.add(new MyClass("Sane"));
                ts.add(new MyClass("Jesus"));
                ts.add(new MyClass("Salah"));
		System.out.println(ts);

	}
}
