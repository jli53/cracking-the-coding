public class rmMid{
	public void rmM(Node head){
		Node p = null;
		Node n = head;
		Node m = head;
		boolean has_mid = true;
		if(n == null){
			has_mid = false;
		}
		while(m.next!=null){
			p = n;
			n = n.next;
			m = m.next;
			if(m.next==null){ //tell the number of nodes is odd or even
				has_mid = false;
				break;
			}
			m = m.next;
		}
		if(has_mid && p!=null){
			p.next = n.next; //delete the mid node
		}
		else
			System.out.println("no mid node");
	}
}