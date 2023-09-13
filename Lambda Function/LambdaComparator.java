import java.util.*;

class Employee{
	int empID=0;
	String name=null;
	Employee(int empID,String name){
		this.empID=empID;
		this.name=name;
	}
	public String toString(){
		return empID + " : " + name;
	}
}

class demo{
	public static void main(String [] args){
		ArrayList al = new ArrayList();
		al.add(new Employee(25,"Krishn"));
		al.add(new Employee(21,"Ashish"));
		al.add(new Employee(22,"Rahul"));
		System.out.println(al);
		Collection.sort(al,(obj1,obj2))->{return((Employee)obj1).name.compareTo((Employee)obj2).name;}};
		System.out.println(al);
	}	
}
