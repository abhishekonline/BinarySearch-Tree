import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class NextRightPointer {
	 
	 
	  public static void connect(TreeLinkNode root) {
		  if(root==null) return;
		  Queue<TreeLinkNode> que= new LinkedList<TreeLinkNode>();
		  que.add(root);
		  ArrayList<ArrayList<TreeLinkNode>> ans= new ArrayList<>();
		  
		  
		  while(que.size()>0){
			ArrayList<TreeLinkNode> tal= new ArrayList<TreeLinkNode>();
			int size= que.size();
			for(int i=0;i<size;i++){
				TreeLinkNode temp =que.remove();
				tal.add(temp);
				if(temp.left!=null)
					que.add(temp.left);
				if(temp.right!=null)
					que.add(temp.right);
			}
			ans.add(tal);
		  }
	       
		  for(ArrayList<TreeLinkNode> iti: ans){
			  for(int j=0;j<iti.size();j++){
				  TreeLinkNode curr= iti.get(j);
				  System.out.print(curr.val+" ,");
				  if(j==iti.size()-1)
					  curr.next=null;
				  else
					  curr.next=iti.get(j+1);
			  }System.out.println();
		  }
		  
	    }

	  public static void main(String args[]){
		  
		  TreeLinkNode a= new TreeLinkNode(1);
		  TreeLinkNode b= new TreeLinkNode(2);
		  TreeLinkNode c= new TreeLinkNode(3);
		  a.left=b;
		  a.right=c;
		  TreeLinkNode d= new TreeLinkNode(4);
		  TreeLinkNode e= new TreeLinkNode(5);
		  TreeLinkNode f= new TreeLinkNode(6);
		  TreeLinkNode g= new TreeLinkNode(7);
		  b.left=d;
		  b.right=e;
		  c.left=f;
		  c.right=g;

		  connect(a);
		  System.out.println(a.next);
		  System.out.println(b.next.val);
		  System.out.println(b.next.next);
		  System.out.println();
		  
	  }
}
