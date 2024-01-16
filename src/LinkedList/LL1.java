package LinkedList;

public class LL1 {
    public static Node head;
    public static Node tail;
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addfirst(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            head.next=null;
            tail.next=null;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            head.next=null;
            tail=newNode;
            tail.next=null;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void printlist(){
        Node temp = head;
        if(head==null){
            System.out.println("LL is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void reverseLL(){
        Node curr=head;
        Node next;
        Node prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String[] args) {
        LL1 ll = new LL1();
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.printlist();
        ll.reverseLL();
        ll.printlist();
    }
}
