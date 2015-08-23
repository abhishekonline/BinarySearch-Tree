
public class LCA {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	       if(p==root || q==root || root==null)return root;
		   TreeNode left= lowestCommonAncestor(root.left,p,q);
		   TreeNode right=lowestCommonAncestor(root.right,p,q);
		   if(left!=null && right!=null) return root;
		   else{
			   if(left!=null)
				   return left;
			   else if(right!=null)
				   return right;
			   else {
				   System.out.println("No match found");
				   return null;
			   }
		   }
		  // return (left!=null && right!=null)?root:(left!=null)?left:right;
				   
	    }
	public static void main(String args[]){
		TreeNode a= new TreeNode(1);
		TreeNode b= new TreeNode(2);
		TreeNode c= new TreeNode(3);
		TreeNode d= new TreeNode(5);TreeNode e= new TreeNode(4);
		b.left=a;
		b.right=c;
		LCA obj= new LCA();
		System.out.println(obj.lowestCommonAncestor(b, d, e).val);
		
	}
}
