import java.util.ArrayList;


public class pathSumII {
	
	    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
	        ArrayList<ArrayList<Integer>> ans= new ArrayList<ArrayList<Integer>>();
	        helper(root, sum,  new ArrayList<Integer>(),ans);
	        return ans;
	    }
	    private void helper(TreeNode root, int sum,	ArrayList<Integer> inner, ArrayList<ArrayList<Integer>> ans) {
			if(root==null) return ;
			inner.add(root.val);
			if(root.left==null && root.right==null&& sum==root.val){
				System.out.println("true"+","+inner);
				ans.add(new ArrayList<Integer>(inner));
			}
			else{
				helper(root.left,sum-root.val,inner, ans);
				helper(root.right,sum-root.val,inner, ans);
			}
			inner.remove(inner.size()-1);
			
		}
		
}
