import java.util.*;

class LinkedListDemo{
	public static void main(String[] args){
		LinkedList LL = new LinkedList();
		LL.add(10);
		LL.add(40);
		LL.add(70);
		LL.add(80);
		LL.add(90);
		System.out.println(LL);
		System.out.println("Frist:"+ LL.getFirst());
		System.out.println("last:"+LL.getLast());
		System.out.println("size:"+LL.size());
		System.out.println("element added-> "+ LL.add(100));
		LinkedList LL2 = new LinkedList();
		LL2.add(110);
		LL2.add(130);
		LL2.add(150);
		LL2.add(170);
		System.out.println("LL2:"+ LL2);
		LL.addAll(LL2);
		System.out.println("New LL: "+ LL);
		System.out.println("removed element: "+ LL.remove());
		LL.set(6,40);
		System.out.println("index of 40 from start: "+ LL.indexOf(40));
		System.out.println("index of 40 from last: "+ LL.lastIndexOf(40));
		System.out.println("peek: "+ LL.peek());
		System.out.println("peekfirst: "+ LL.peekFirst());
		System.out.println("peekLast: "+ LL.peekLast());
		System.out.println("poll: "+ LL.poll());
		System.out.println("pollfirst: "+ LL.pollFirst());
		System.out.println("polllast: "+ LL.pollLast());
		System.out.println("get element at index 4: "+ LL.get(4));
		System.out.println("LL: "+ LL);
		System.out.println("set index 3 as 69"+ LL.set(3,69));
                System.out.println("LL: "+ LL);

	}
}
