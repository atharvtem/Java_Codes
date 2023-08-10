import java.util.*;

class cricketplay{
	int jerNo =0;
	String name = null;

	public cricketplay(int jerNo,String name){
		this.jerNo=jerNo;
		this.name=name;
	}
	public String toString(){
		return name;
	}
	//if this toString is not written the output of code will be :
	// ClassName@Address
}

class LinkedHashSetRepair{
	public static void main(String [] args){
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(new cricketplay(18,"Virat"));
                lhs.add(new cricketplay(7,"Mahi"));
                lhs.add(new cricketplay(10,"Messi"));
                lhs.add(new cricketplay(07,"Ronaldo"));
		System.out.println(lhs);
	}
}
