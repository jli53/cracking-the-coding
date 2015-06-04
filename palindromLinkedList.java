public class palindromLinkedList{
	public boolean check(Node head){
		int count = 0;
		boolean palindrom = true;
		Node n = head;
		while(n!=null){
			count++;
			n=n.next;
		}
		int mid = count/2;
		int[]compare = new int[mid];
		n = head;
		for(int i = 0; i<mid; i++){
			compare[i] = n.data;
			n = n.next;
		}
		if(count%2==1){
			n = n.next;
		}
		for(int i =0; i<mid; i++){
			if(n.data!=compare[mid-i-1]){
				palindrom = false;
				break;
			}
			n = n.next;
		}
		return palindrom;
	}
}