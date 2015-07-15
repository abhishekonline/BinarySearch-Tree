import java.util.ArrayList;


public class PathSumBT {
	public static  void sumpath(TreeNode root, int sum) {
		helper(root, new ArrayList<Integer>(),sum);
	}
	private static void helper(TreeNode root, ArrayList<Integer> arrayList, int sum) {
		//System.out.println(root.val+","+arrayList+","+sum);
		arrayList.add(root.val);
		if(sum==root.val){
			System.out.println(arrayList);
			arrayList.remove(arrayList.size()-1);
			return;
		}
		else{
			if(root.left!=null){
				helper(root.left, arrayList, sum-root.val);
			}
			if(root.right!=null){
				helper(root.right, arrayList, sum-root.val);
			}
			arrayList.remove(arrayList.size()-1);
		}
	}
	public static void main(String args[]){
		TreeNode a= new TreeNode(3);
		TreeNode b= new TreeNode(4);
		TreeNode c= new TreeNode(5);
		TreeNode d= new TreeNode(2);
		TreeNode e= new TreeNode(1);
		TreeNode f= new TreeNode(8);
		a.left=b;
		b.left=c;
		b.right=d;
		a.right=e;
		e.right=f;
		sumpath(a, 12);

		
	}
	
}
