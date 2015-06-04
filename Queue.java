public class Queue{
	Node head, tail;
	void enqueue(Object item){
		Node t = new Node((int)item);
		if(tail == null){
			head = tail = t;
		}
		else{
			tail.next = t;
			tail = t;
		}
	}
	Object dequeue(){
		if(head == null){
			return null;
		}
		else{
			Object item = head.data;
			head = head.next;
			return item;
		}
	}
}