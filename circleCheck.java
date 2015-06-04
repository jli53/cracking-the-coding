public class circleCheck{
	public Node startCircle(Node head){
		Node n = head;
		Node m = head;
		int count = 0;
		while(true){
			n = n.next;
			count ++;
			m = head;
			for(int i = 0; i< count; i++){
				if(m == n){
					return m;
				}
				else
					m = m.next;
			}
		}
	}
}