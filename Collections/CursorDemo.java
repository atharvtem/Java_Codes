import java.util.*;

class CursorDemo{
	public static void main(String [] args){
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20.5f);
		al.add(30.6d);
		al.add("Attem");
		System.out.println("Classname and datatyoes:");
		for(var x:al){
			System.out.println(x.getClass().getName());
		}

	}
}
