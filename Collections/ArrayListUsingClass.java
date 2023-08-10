import java.util.*;

class cricketplay{
	int jerNo = 0;
	String name = null;
	cricketplay(int jerNo,String name){
		this.jerNo=jerNo;
		this.name=name;
	}
	public String toString(){
		return name;
	}
}

class ArrayListDemo{
	public static void main(String [] args){
		ArrayList al = new ArrayList();
		al.add(new cricketplay(18,"Virat"));
		al.add(new cricketplay(21,"attem"));
		al.add(new cricketplay(7,"MS Dhoni"));
		System.out.println(al);
	}
}
