import java.util.ArrayList;


public class BSTImproved {
	public ArrayList<Integer> inorderRec(TreeNode n, ArrayList<Integer>al){
	if(n!=null){
		inorderRec(n.left, al);
		al.add(n.val);
		inorderRec(n.right, al);
	}
	return al;
	}
}
