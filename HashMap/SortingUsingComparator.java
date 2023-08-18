import java.util.*;

class SortByName implements Comparator{
	public int Compare(object obj , Object obj2){
		return ((platform)obj1).str.compareTo((((platform)obj2)str));
	}
}

class TreeDemo{
	public static void main(String []args){
		TreeMap tm = new TreeMap();
		tm.put(new platform("Youtube",2005),"Google");
                tm.put("Instagram",2013,"Meta");
                tm.put("Facebook",2004,"Meta");
                tm.put("ChatGPT",2022,"OpenAI");
                System.out.println(tm);

	}
}
