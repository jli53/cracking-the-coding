public class Node{
	Node next = null;
	int data;
	public Node(int a){
		data = a;
	}
	void appendToTail(int a){
		Node end = new Node(a);
		Node n = this;
		while(n.next!=null){
			n = n.next;
		}
		n.next = end;
	}
	Node deleteNode(Node head, int d){
		Node n = head;
		if(n.data == d){
			return n.next;
		}
		while(n.next!=null){
			if(n.next.data == d){
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		return head;
	}
	void display(Node head){
		Node n = head;
		while(n!=null){
			System.out.println(n.data);
			n = n.next;
		}
	}
}