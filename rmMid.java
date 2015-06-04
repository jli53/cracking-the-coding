//only have access to the node that needs to be removed, don't have access to the head;
public class rmMid{
	public void rmM(Node mid){
		if(mid.next == null || mid == null){
			System.out.println("cannot delete the last node!");
			return;
		}
		Node n = mid.next;
		mid.data = n.data;
		mid.next = n.next;
		return;
	} 
}
