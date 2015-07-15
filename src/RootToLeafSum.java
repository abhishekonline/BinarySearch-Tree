
public class RootToLeafSum {
	int total=0;
	public int sumNumbers(TreeNode root) {
		helper(root,"");
		return total;
    }

	private void helper(TreeNode root, String sum) {
		if (root == null)
			return;
		sum = sum + Integer.toString(root.val);
		if (root.left == null && root.right == null) {
			total += Integer.valueOf(sum);
		} else {
			helper(root.left, sum);
			helper(root.right, sum);
		}
		sum = sum.substring(0, sum.length() - 1);
	}
	
}
