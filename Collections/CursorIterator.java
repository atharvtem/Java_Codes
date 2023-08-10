import java.util.*;

class CursorIterator{
	public static void main(String [] args){
		/*  Code for arraylist cursor
		ArrayList al = new ArrayList();
		al.add("K");
		al.add("R");
		al.add("I");
		al.add("S");
		al.add("H");
		al.add("N");
		al.add("A");
		Iterator cursor = al.iterator();
		int i=0;
		while(cursor.hasNext()){
			System.out.println("Now cursor is at: "+ i);
			if(("Kahna").equals(cursor.next())){
				cursor.remove();
			}
			i++;
		}
		*/

		/*
			Code for linkedlist cursor
		LinkedList LL = new LinkedList();
		LL.add("K");
                LL.add("R");
                LL.add("I");
                LL.add("S");
                LL.add("H");
                LL.add("N");
                LL.add("A");
		ListIterator litr = LL.listIterator();
		int j=0;
		while(litr.hasNext()){
			System.out.println("List Cursor is at: "+ j);
			System.out.println(litr.next());
			j++;
		}
		while(litr.hasPrevious()){
			System.out.println("List Cursor is at: "+ j);
			System.out.println(litr.previous());
			j--;
		}
		*/

		Vector v = new Vector();
		v.addElement("J");
		v.addElement("o");
		v.addElement("k");
		v.addElement("e");
		Enumeration cursor = v.elements();
		int k=0;
		while(cursor.hasMoreElements()){
			System.out.println("Cursor is at: "+k);
			System.out.println(cursor.nextElement());
			k++;
		}
	}
}
