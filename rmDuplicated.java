import java.util.Hashtable;
public class rmDuplicated{
	public void delete(Node head){
		Node n = head;
		Node previous = null;
		Hashtable h = new Hashtable();
		while(n!=null){
			if(h.containsKey(n.data)){
				previous.next = n.next;
			}
			else{
				h.put(n.data, true);
				previous = n;
			}
			n = n.next;
		}
	}
}