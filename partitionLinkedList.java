public class partitionLinkedList{
	public Node partition(Node head, int x){
		Node head_small = new Node(0);
		Node head_big = new Node(0);
		Node n = head;
		while(n!=null){
			if(n.data > x){
				head_big.appendToTail(n.data);
			}
			else{
				head_small.appendToTail(n.data);
			}
			n = n.next;
		}
		if(head_big.next!=null){
			head_big = head_big.next;
		}
		else
			return head;
		if(head_small.next!=null){
			head_small = head_small.next;
		}
		else
			return head;
		Node m = head_big;
		while(head_big.next!=null){
			head_big = head_big.next;
		}
		head_big.next = head_small;
		return m;
	}
}