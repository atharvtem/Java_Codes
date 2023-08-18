import java.util.*;

class DictionaryDemo{
	public static void main(String [] args){
		Dictionary dt = new Hashtable();
       		dt.put(10,"Sachin");
	        dt.put(7,"MSD");
        	dt.put(18,"Virat");
                dt.put(1,"KL");
                dt.put(45,"Rohit");
		System.out.println(dt);
		
		Enumeration itr1 = dt.keys();
		while(itr1.hasMoreElements()){
			System.out.println(itr1.nextElement());
		}

		Enumeration itr2 = dt.elements();
		while(itr2.hasMoreElements()){
			System.out.println(itr2.nextElement());
		}

		System.out.println(dt.get(10));
		dt.remove(45);
		System.out.println(dt);
	}	
}
