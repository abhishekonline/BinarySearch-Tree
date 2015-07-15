import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class driver {

	public static void main(String args[]) {

		BST tree = new BST();
		tree.insert(43, 43);
		tree.insert(21, 21);
		tree.insert(56, 56);
		tree.insert(14, 14);
		tree.insert(35, 35);
		tree.insert(55, 55);
		tree.insert(97, 97);

		System.out.println("find 23=" + tree.find(23));
		System.out.println("find 35=" + tree.find(35));
		System.out.println("*******TRAVERSE**********");
		tree.traverce(0);
		System.out.println();
		tree.traverce(1);
		System.out.println();
		tree.traverce(2);
		System.out.println();
		System.out.println("*******TRAVERSE END*******");
		System.out.println("height=" + tree.height());

		System.out.println("no. of node=" + tree.numofnodes());

		List<Integer> ans = tree.rightSideView();
		System.out.println("RIGHT SIDE VIEW"+Arrays.toString(ans.toArray()));
		
		tree.traverce(0);
		System.out.println();
		System.out.println("BFS ");
		tree.BFS();
		System.out.println();
		int succ=tree.getSuccessor(55);
		System.out.println("successor of 55 is = "+succ);
		
		List<Integer> ansLeft = tree.leftSideView();
		System.out.println("LEFT SIDE VIEW"+Arrays.toString(ansLeft.toArray()));
		System.out.println("BFS WITH LINE");
		tree.BFSwithLine();
		// for count complete nodes
		
		CountCompleteNodes n = new CountCompleteNodes();
		TreeNode test=new TreeNode(3);
//		TreeNode a= new TreeNode(2);
//		TreeNode b= new TreeNode(5);
//		TreeNode c= new TreeNode(1);
		
//		test.left=a;
//		test.right=b;
//		a.left=c;
		//System.out.println("complete nodes= "+n.countNodes(test));
		
		TreeNode a= new TreeNode(1);
		TreeNode b= new TreeNode(2);
		TreeNode c= new TreeNode(3);
		TreeNode d= new TreeNode(4);
		a.left=b;
		a.right=c;
		c.left=d;
//		CheckIfBST checker= new CheckIfBST();
//		System.out.println("A denote a BST ? "+checker.check(a));
		
//		IterativeTraversal newobj= new IterativeTraversal();
		//newobj.IterativePreorder(a);
//		newobj.IterativePostorder(a);
//		pathSumII ne= new pathSumII();
//		List<ArrayList<Integer>> voila = ne.pathSum(a, 13);
//		System.out.println(voila);
		
		RootToLeafSum ne= new RootToLeafSum();
		int answer=ne.sumNumbers(a);
		System.out.println("ans= "+answer);
		
		String i="12";
		int lol=Integer.valueOf(i)*2;
		System.out.println(lol);}

}
