import java.util.*;

class StackDemo{
	public static void main(String[] args){
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s);
		System.out.print("peek: ");
		s.peek();
		System.out.println(s.pop());
	}
}