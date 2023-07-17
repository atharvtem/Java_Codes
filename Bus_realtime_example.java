class PMPML{
	int BusNo=43;
	String route = "Via Chandani Chowk";
	static tring destination = "Hinjewadi";

	void display(){
		System.out.println(BusNo);
		System.out.println(route);
		System.out.println(destination);
	}
}
class user{
	public static void main(String [] args){
		PMPML user1 = new PMPML();
		PMPML user2 = new PMPML();

		user1.display();
		user2.display();

		user2.BusNo=24;
		user2.route="Via Swargate";
		user2.destination="Katraj";

		System.out.println("-----------------");

		user1.display();
		user2.display();
	}
} 
