public class LinkedListAdd{
	public Node add(Node head1, Node head2){
		Node n = new Node(0);
		int num1, num2, sum, over;
		over = 0;
		while(head1 != null || head2 != null|| over ==1){
			if(head1 == null){
				num1 = 0;
			}
			else{
				num1 = head1.data;
				head1 = head1.next;
			}
			if(head2 == null){
				num2 = 0;
			}
			else{
				num2 = head2.data;
				head2 = head2.next;
			}
			sum = num1 + num2 + over;
			sum = sum >= 10?sum-10:sum;
			Node new_node = new Node(sum);
			n.appendNode(new_node);
		}
		return n.next;
	}
}