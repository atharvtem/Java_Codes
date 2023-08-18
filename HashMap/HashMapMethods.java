import java.util.*;

class HashMapMethods{
	public static void main(String [] args){
		HashMap hm = new HashMap();
		hm.put("Java",".java");
                hm.put("Python",".py");
                hm.put("CPP",".cpp");
                hm.put("C",".c");
		System.out.println(hm);
		System.out.println("get function: "+ hm.get("Python"));		//return value of key python
		System.out.println("keyset function: "+ hm.keySet());		//return list of keys
		System.out.println("values : "+hm.values());			//return all values
		System.out.println("entryset : "+hm.entrySet());		//it converts to something like list and then we can access index wise

	}
}
