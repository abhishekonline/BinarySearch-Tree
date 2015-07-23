
public class MaximumPathSumBT {
	static int max;
	public static int maxPathSum(TreeNode root) {
		int max[] = new int[1]; 
		max[0] = Integer.MIN_VALUE;
		helper(root,max);
        return max[0];
    }
	private static int helper(TreeNode root, int[] max) {
		if(root==null) return 0;
		int left=helper(root.left, max);
		int right= helper(root.right,max);
		int curr= Math.max(root.val, Math.max(root.val+left, root.val+right));
		max[0]=Math.max(max[0], Math.max(curr, left+right+root.val));
		return curr;
		
	}
	public static void main(String args[]){
		TreeNode a= new TreeNode(7);
		TreeNode b= new TreeNode(5);
		TreeNode c= new TreeNode(11);
		TreeNode d= new TreeNode(3);
		TreeNode e= new TreeNode(2);
		TreeNode f= new TreeNode(9);
		TreeNode g= new TreeNode(12);
		a.left=b;
		a.right=c;
		b.left=d;
		b.right=e;
		c.left=f;
		c.right=g;
		int ans=maxPathSum(a);
		System.out.println(ans);
		
	}
}
