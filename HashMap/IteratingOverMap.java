import java.util.*;

class IteratorMapDemo{
	public static void main(String [] args){
		SortedMap tm = new TreeMap();
		tm.put("IND","India");
                tm.put("AUS","Australia");
                tm.put("PAK","Pakistan");
                tm.put("BAN","Bangladesh");
                tm.put("SL","Srilanka");
		System.out.println(tm);
		
		Set<Map.Entry> data = tm.entrySet();
		Iterator<Map.Entry> itr = data.iterator();

		while(itr.hasNext()){
			//System.out.println(itr.next());
			Map.Entry abc = itr.next();
			System.out.println(abc.getKey() + " : " + abc.getValue());
		}
	}
}
