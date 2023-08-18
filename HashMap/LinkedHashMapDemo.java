import java.util.*;

class LinkedHashMapDemo{
	public static void main(String [] args){
		LinkedHashMap lh = new LinkedHashMap();
		lh.put("Kanha","Infosys");
                lh.put("Ashish","Barclays"); 
                lh.put("Badhe","BMC");
                lh.put("Rahul","CarPro");
		System.out.println(lh);
		//linked hash map prints data in order it is input

	}
}
