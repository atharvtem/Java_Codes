import java.util.*;

class HashSetDemo{
	public static void main(String [] args){
		HashSet hs = new HashSet();
		hs.add("Kanhaiya");
		hs.add("Krishna");
		hs.add("Madhusudan");
		hs.add("Keshav");
		hs.add("Janardan");
		hs.add("Ahyut");
		System.out.println(hs);
	}
}
// these elements added are not printed in order because it is like hash map
// we can not control their pritning order
