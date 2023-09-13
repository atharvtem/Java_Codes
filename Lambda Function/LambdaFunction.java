interface Core2Web{
	void lang();
}
class Year2022{
	public static void main(String [] args){
		Core2Web c2w = () -> {
			System.out.println("Java/CPP/Python");
		};		
		c2w.lang();
	}
}
