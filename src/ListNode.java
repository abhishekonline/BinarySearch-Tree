

public class ListNode {
		     public int val;
		     public  ListNode next;
		     public ListNode(int x) { val = x; }
		      
 public void traverse (ListNode n){
	 while(n!=null)
	 {
		 System.out.print("["+n.val+"] ");
		 n=n.next;
	 }
	 
 }
		 
}


