
public class listtobst {
	ListNode cutatmid(ListNode head){
        if(head == null) return null;
        
        ListNode fast = head;
        ListNode slow = head;
        ListNode pslow = head;

        while(fast != null && fast.next != null){
            pslow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        pslow.next = null;
        return slow;
    }
    
    public TreeNode sortedListToBST(ListNode head) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        
        if(head == null) return null;
        
        if(head.next == null) return new TreeNode(head.val);
        
        ListNode mid = cutatmid(head);
        System.out.println(head.val+","+mid.val);
        TreeNode root = new TreeNode(mid.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(mid.next);
        
        return root;
    }
    public static void main(String args[]){
    	ListNode a= new ListNode(1);
    	ListNode b= new ListNode(2);
    	ListNode c= new ListNode(3);
    	ListNode d= new ListNode(4);
    	ListNode e= new ListNode(5);
    	a.next=b;
    	b.next=c;
    	c.next=d;
    	d.next=e;
    	listtobst obj= new listtobst();
    	TreeNode ans=obj.sortedListToBST(a);
    	System.out.println("----");
    	System.out.println(ans.val);
    	System.out.println(ans.left.val);
    	System.out.println(ans.right.val);
    }

}
