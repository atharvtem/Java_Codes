import java.util.*;

class SortedMapDemo{
	public static void main(String [] args){
		SortedMap tm = new TreeMap();
                tm.put("IND","India");
                tm.put("SL","SriLanka");
                tm.put("PAK","Pakistan");
                tm.put("AUS","Australia");
                tm.put("BAN","Bangladesh");
		System.out.println(tm);
                System.out.println(tm.subMap("AUS","PAK"));
                System.out.println(tm.headMap("PAK"));
                System.out.println(tm.tailMap("PAK"));
                System.out.println(tm.firstKey());
                System.out.println(tm.lastKey());
                System.out.println(tm.values());

	}
}
