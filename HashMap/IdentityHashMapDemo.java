import java.util.*;

class IdentityHashMapDemo{
	public static void main(String [] args){
		IdentityHashMap hm = new IdentityHashMap();
		hm.put(new Integer(10),"Kanha");
                hm.put(new Integer(10),"Ahish");
                hm.put(new Integer(10),"Rahul");
                hm.put(new Integer(10),"Dube");
		System.out.println(hm);
	}
}
