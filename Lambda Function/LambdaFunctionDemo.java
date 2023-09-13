interface Core2web{
	String lang(int numCourse);
}

class Year2022{
	public static void main(String [] args){
		Core2web c2w = (xyz)-> "Java/CPP/Python";
		System.out.println(c2w.lang(8));
	}
	
}
