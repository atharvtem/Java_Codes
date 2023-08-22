import java.util.*;

class DequeDemo{
	public static void main(String [] args){
		Deque dq = new ArrayDeque();
		dq.offer(10);
                dq.offer(40);
                dq.offer(20);
                dq.offer(30);
		System.out.println(dq);
		dq.offerFirst(5);
		dq.offerLast(50);
		System.out.println(dq);
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
		Iterator itr = dq.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next() + ", ");
		}
		System.out.println();
		Iterator itr2 = dq.descendingIterator();
		while(itr2.hasNext()){
			System.out.print(itr2.next() + ", ");
		}
	}
}
