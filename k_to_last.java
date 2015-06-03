public class k_to_last{
	public void find_ktolast(Node head, int k){
		Node n = head;
		boolean found = false;
		int index = 0;
		while(n!=null){
			if(!found){
				index++;
				if(index==k){
					found = true;
					System.out.println(n.data);
				}
			}
			else{
				System.out.println(n.data);
			}
			n = n.next;
		}
	}
}