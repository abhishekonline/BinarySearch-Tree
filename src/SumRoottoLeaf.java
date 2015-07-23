
public class SumRoottoLeaf {
	//static int total=0;
    public static int sumNumbers(TreeNode root) {
        int[] total=new int[1];
        total[0]=0;
    	helper(root,"",total);
		return total[0];
    }
    private static void helper(TreeNode root, String sum,int[] total) {
		    if (root == null)
			return;
		    sum = sum + Integer.toString(root.val);
	    	if (root.left == null && root.right == null) {
			total[0] += Integer.valueOf(sum);
			System.out.println(sum);
		    } else {
			helper(root.left, sum, total);
			helper(root.right, sum,total);
	    	}
		    sum = sum.substring(0, sum.length() - 1);
	}
    public static void main(String args[]){
		TreeNode a= new TreeNode(1);
		TreeNode b= new TreeNode(2);
		TreeNode c= new TreeNode(3);
		TreeNode d= new TreeNode(2);
		TreeNode e= new TreeNode(1);
		TreeNode f= new TreeNode(8);
		a.left=b;
		a.right=c;
//		b.right=d;
//		a.right=e;
//		e.right=f;
		System.out.println("Answer= "+sumNumbers(a));

		
	}

}
