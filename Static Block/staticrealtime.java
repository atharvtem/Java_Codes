class mahavitaran{
	static int PricePerUnit= 5;
	int UnitConsumption = 100;
	String username= "C2W";
	void customer(){
		System.out.println("Name = "+ username);
		System.out.println("Units used:" + UnitConsumption);
	}
	static void Bill(){
		mahavitaran bill1 = new mahavitaran();
		System.out.println("Bill = Rs." + bill1.UnitConsumption*PricePerUnit);
	}
}
class user{
	public static void main(String [] args){
		mahavitaran user1= new mahavitaran();
		user1.customer();
		user1.Bill();
		System.out.println("---------------");
		System.out.println(user1.PricePerUnit);
		System.out.println(user1.username);
	}
}
